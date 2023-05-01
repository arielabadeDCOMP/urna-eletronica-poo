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

    // verifica se o CPF tem 11 caracteres
    if (cpf.length() != 11) {
        return false;
    }

    // verifica se o CPF contém apenas números
    for (int i = 0; i < cpf.length(); i++) {
        if (!Character.isDigit(cpf.charAt(i))) {
            return false;
        }
    }

    // verifica se o CPF tem o formato correto
    int soma = 0;
    int resto;

    for (int i = 0; i < 9; i++) {
        soma += (cpf.charAt(i) - '0') * (10 - i);
    }

    resto = 11 - (soma % 11);

    if (resto == 10 || resto == 11) {
        resto = 0;
    }

    if (resto != cpf.charAt(9) - '0') {
        return false;
    }

    soma = 0;
    for (int i = 0; i < 10; i++) {
        soma += (cpf.charAt(i) - '0') * (11 - i);
    }

    resto = 11 - (soma % 11);

    if (resto == 10 || resto == 11) {
        resto = 0;
    }

    if (resto != cpf.charAt(10) - '0') {
        return false;
    }

    return true;
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
}
