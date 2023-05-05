/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UrnaEletronica.Model;

import UrnaEletronica.Model.Eleitor;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ARIEL
 */
public class CandidatoTangerina extends Candidato {

  
 
    public CandidatoTangerina(String nomeDoCandidato, int numero) {
        super(nomeDoCandidato, numero);
    }

    public String getNomeDoCandidato(String text) {
        return nomeDoCandidato;
    }

    public int getNumero(String text) {
        return numero;
    }
    
    
    
      public String salvarVotosEmCandidatos()  {
        try{
        FileWriter escreverNoArquivo = new FileWriter("votos.txt");
        PrintWriter imprimirNoArquivo = new PrintWriter(escreverNoArquivo);
        imprimirNoArquivo.println("Nome Do Cannidato" + this.nomeDoCandidato);
        imprimirNoArquivo.println("Voto: " + this.numero);
        escreverNoArquivo.flush();
        escreverNoArquivo.close();
        imprimirNoArquivo.close();
        
    } catch (IOException ex) {
        Logger.getLogger(Eleitor.class.getName()).log(Level.SEVERE,null, ex);
    }
        return null;
    }
}

        
    
    

