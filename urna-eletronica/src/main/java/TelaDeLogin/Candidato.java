/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package TelaDeLogin;

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


       protected String CPF;
       protected char numero;

    public Candidato(String CPF, char numero) {
        this.CPF = CPF;
        this.numero = numero;
    }
          public String getNome() {
        return CPF;
    }

    public void setNome(String CPF) {
        this.CPF = CPF;
    }

    public char getNumero() {
        return numero;
    }

    public void setNumero(char numero) {
        this.numero = numero;
    }
       
      public String salvarVotosEmCandidatos()  {
        try{
        FileWriter escreverNoArquivo = new FileWriter("votosEmCandidados.txt");
        PrintWriter imprimirNoArquivo = new PrintWriter(escreverNoArquivo);
        imprimirNoArquivo.println("Nome do Candidato: " + this.CPF);
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
