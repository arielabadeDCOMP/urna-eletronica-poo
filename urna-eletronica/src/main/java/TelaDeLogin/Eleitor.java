/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package TelaDeLogin;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ARIEL
 */
public class Eleitor {

    String nome;
    String CPF; 
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    
    
public boolean validarCPF() {
    String cpf = this.CPF;

    // verifica se o CPF tem 11 caracteres e contém apenas números
    return cpf.matches("\\d{11}");
}

    public String salvar()  {
        try{
        FileWriter escreverNoArquivo = new FileWriter("eleitores.txt");
        PrintWriter imprimirNoArquivo = new PrintWriter(escreverNoArquivo);
        imprimirNoArquivo.println("Nome: " + this.nome);
        imprimirNoArquivo.println("CPF: " + this.CPF);
        escreverNoArquivo.flush();
        escreverNoArquivo.close();
        imprimirNoArquivo.close();
        
    } catch (IOException ex) {
        Logger.getLogger(Eleitor.class.getName()).log(Level.SEVERE,null, ex);
    }
        return null;
    }
    /*
    
    public void mensagemSalva() {
        System.out.println("A mennsagem foi salva");
    }*/
}
