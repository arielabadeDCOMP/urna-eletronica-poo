/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UrnaEletronica.Model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author ARIEL
 */
public class CandidatoMexerica extends Candidato {
    
    public CandidatoMexerica(String nome) {
        super(nome);
        
    }

    public String getNomeDoCandidato() {
        return nomeDoCandidato;
    }

    public void setNomeDoCandidato(String nomeDoCandidato) {
        this.nomeDoCandidato = nomeDoCandidato;
    }
    
    
    
   public String salvarVotosEmCandidatos()  {
    try{
        FileWriter escreverNoArquivo = new FileWriter("votos.txt", true);
        PrintWriter imprimirNoArquivo = new PrintWriter(escreverNoArquivo);
        imprimirNoArquivo.println("Nome Do Candidato: " + this.nomeDoCandidato);
        escreverNoArquivo.flush();
        escreverNoArquivo.close();
        imprimirNoArquivo.close();
    } catch (IOException ex) {
        Logger.getLogger(Eleitor.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;
}
    
}
