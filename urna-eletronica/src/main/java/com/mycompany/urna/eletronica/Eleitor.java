/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.urna.eletronica;

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

    int CPF; 
    String nome;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }
    
  public  boolean validarCPF(int CPF) {
    // Formata o CPF em uma string com 11 dígitos
    String CPFString = String.format("%011d", CPF);
    // Verifica se a string do CPF tem 11 dígitos
    if (CPFString.length() != 11) {
        System.out.println("CPF inválido. Por favor, insira novamente.");
        return false;
    }

    // Converte a string do CPF em um array de inteiros
    int[] numerosCPF = new int[11];
    for (int i = 0; i < 11; i++) {
        numerosCPF[i] = Integer.parseInt(CPFString.substring(i, i + 1));
    }

    // Calcula o primeiro dígito verificador
    int soma = 0;
    for (int i = 0; i < 9; i++) {
        soma += numerosCPF[i] * (10 - i);
    }

    int resto = soma % 11;
    int primeiroDigitoVerificador = (resto < 2) ? 0 : (11 - resto);

    // Calcula o segundo dígito verificador
    soma = 0;
    for (int i = 0; i < 10; i++) {
        soma += numerosCPF[i] * (11 - i);
    }

    resto = soma % 11;
    int segundoDigitoVerificador = (resto < 2) ? 0 : (11 - resto);

    // Verifica se os dígitos verificadores calculados são iguais aos dígitos do CPF
    if (numerosCPF[9] != primeiroDigitoVerificador || numerosCPF[10] != segundoDigitoVerificador) {
        System.out.println("CPF inválido. Por favor, insira novamente.");
        return false;
    }

    // Se tudo estiver correto, retorna verdadeiro
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
