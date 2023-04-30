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



     String regiao;
     String nome;
     int numero;
     
    public String getRegiao() {
        return regiao;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }
    
        public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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
