/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package UrnaEletronica.Model;

import UrnaEletronica.Model.Eleitor;
import com.mycompany.urna.eletronica.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author ARIEL
 */
public abstract class Candidato {


       protected String nomeDoCandidato;
       protected int numero;
       
         public Candidato(String nomeDoCandidato, int numero) {
        this.nomeDoCandidato = nomeDoCandidato;
        this.numero = numero;
    }

 

 

    
       
      public String salvarVotosEmCandidatos()  {
        try{
        FileWriter escreverNoArquivo = new FileWriter("votosEmCandidados.txt");
        PrintWriter imprimirNoArquivo = new PrintWriter(escreverNoArquivo);
        imprimirNoArquivo.println("Nome do Candidato: " + this.nomeDoCandidato);
        imprimirNoArquivo.println("Numero do candidato" + this.numero);
        escreverNoArquivo.flush();
        escreverNoArquivo.close();
        imprimirNoArquivo.close();
        
    } catch (IOException ex) {
        Logger.getLogger(Eleitor.class.getName()).log(Level.SEVERE,null, ex);
    }
        return null;
    }

    
   
}
