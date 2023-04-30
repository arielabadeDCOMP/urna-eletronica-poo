/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.urna.eletronica;

/**
 *
 * @author ARIEL
 */
public class Candidato {

    public Candidato(String nome, String CPF) {
        this.nome = nome;
        this.cpf = cpf;
    }
     
     String nome;
     String cpf;
     
     
    public String getNome() {
        return nome;
    }

    public String getcpf() {
        return cpf;
    }
    


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setcpf(String cpf) {
        this.cpf = cpf;
    }

    /////////////////////////////////CAMDADA DE VALIDAÇÃO DE DADOS///////////////////////////////////////////////////////////////////
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        System.out.println("Candidato");
    }
}
