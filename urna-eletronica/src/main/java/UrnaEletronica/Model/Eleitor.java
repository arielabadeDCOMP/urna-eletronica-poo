/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package UrnaEletronica.Model;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Eleitor {

    private String CPF;
    public String hashCPF;
    private static Set<String> cpfSet = new HashSet<>();
    private static List<String> cpfList = new ArrayList<>(); // criar a lista vazia
    
    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
        try {
            this.hashCPF = generateHash(CPF);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Eleitor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getHashCPF() {
        return hashCPF;
    }

    private String generateHash(String text) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = digest.digest(text.getBytes());
        StringBuilder hexString = new StringBuilder();

        for (byte b : hashBytes) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1)
                hexString.append('0');
            hexString.append(hex);
        }

        return hexString.toString();
    }

    public void salvar() {
        // Adiciona o CPF ao conjunto e à lista
        cpfSet.add(this.CPF);
        cpfList.add(this.hashCPF); // adicionar à lista
        
        try {
            FileWriter escreverNoArquivo = new FileWriter("eleitores.txt", true);
            PrintWriter imprimirNoArquivo = new PrintWriter(escreverNoArquivo);
            imprimirNoArquivo.println("CPF: " + this.hashCPF);
            escreverNoArquivo.flush();
            escreverNoArquivo.close();
            imprimirNoArquivo.close();

        } catch (IOException ex) {
            Logger.getLogger(Eleitor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void salvarVotosCandidatos() {
        // Adiciona o CPF ao conjunto e à lista
        cpfSet.add(this.CPF);
        cpfList.add(this.hashCPF); // adicionar à lista
        
        try {
            FileWriter escreverNoArquivo = new FileWriter("votos.txt", true);
            PrintWriter imprimirNoArquivo = new PrintWriter(escreverNoArquivo);
            imprimirNoArquivo.println("CPF: " + this.hashCPF);
            escreverNoArquivo.flush();
            escreverNoArquivo.close();
            imprimirNoArquivo.close();

        } catch (IOException ex) {
            Logger.getLogger(Eleitor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Método para obter a quantidade de CPFs únicos salvos no conjunto
    public static int getQuantidadeCPFsUnicos() {
        return cpfSet.size();
    }
    
    public static void listarCPFs() {
        for (String cpf : cpfSet) {
            System.out.println(cpf);
        }
    }
    
    // Método para obter a lista de todos os hashes de CPFs salvos
    public static List<String> getHashesCPF() {
        return cpfList;
    }
    
    public static void carregarListaCPFs() {
    try {
        File arquivo = new File("eleitores.txt");
        Scanner leitor = new Scanner(arquivo);
        while (leitor.hasNextLine()) {
            String linha = leitor.nextLine();
            if (linha.startsWith("CPF: ")) {
                String hashCPF = linha.substring(5);
                cpfList.add(hashCPF);
            }
        }
        leitor.close();
    } catch (FileNotFoundException ex) {
        Logger.getLogger(Eleitor.class.getName()).log(Level.SEVERE, null, ex);
    }
}
}