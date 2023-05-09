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
    private String hashCPF;
    private static Set<String> cpfSet = new HashSet<>();
    private static List<String> cpfList = new ArrayList<>();
    
    public String getCPF() {
        return CPF;
    }
    
    private String generateHash(String text) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = digest.digest(text.getBytes());
        StringBuilder hexString = new StringBuilder();

        for (byte b : hashBytes) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }

        return hexString.toString();
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

    public void salvar() {
        cpfSet.add(this.CPF);
        cpfList.add(this.hashCPF);
        
        try {
            FileWriter escreverNoArquivo = new FileWriter("eleitores.txt", true);
            PrintWriter imprimirNoArquivo = new PrintWriter(escreverNoArquivo);
            imprimirNoArquivo.println("CPF: " + this.CPF + "    " + "Hash do CPF: " + this.hashCPF);
            escreverNoArquivo.flush();
            escreverNoArquivo.close();
            imprimirNoArquivo.close();
        } catch (IOException ex) {
            Logger.getLogger(Eleitor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static int getQuantidadeCPFsUnicos() {
        return cpfSet.size();
    }

    public static void listarCPFs() {
        for (String cpf : cpfSet) {
            System.out.println(cpf);
        }
    }

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
                    String cpf = linha.substring(5, 16);
                    String hashCPF = linha.substring(25);
                    cpfSet.add(cpf);
                    cpfList.add(hashCPF);
                }
            }
            leitor.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Eleitor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}