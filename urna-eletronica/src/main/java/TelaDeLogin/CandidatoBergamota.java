/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
public class CandidatoBergamota extends Candidato {

    public CandidatoBergamota(String nomeDoCandidato, int numero) {
        super(nomeDoCandidato, numero);
    }

    public String getNomeDoCandidato() {
        return nomeDoCandidato;
    }

    public int getNumero() {
        return numero;
    }
    
    
    
      public String salvarVotosEmCandidatos()  {
        try{
        FileWriter escreverNoArquivo = new FileWriter("votos.txt");
        PrintWriter imprimirNoArquivo = new PrintWriter(escreverNoArquivo);
        imprimirNoArquivo.println("Nome Do Canndidato" + this.nomeDoCandidato);
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
