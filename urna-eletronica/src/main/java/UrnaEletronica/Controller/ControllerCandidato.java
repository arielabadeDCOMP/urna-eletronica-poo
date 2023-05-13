package UrnaEletronica.Controller;

import UrnaEletronica.Model.CandidatoTangerina;
import UrnaEletronica.Model.Eleitor;
import java.awt.Label;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControllerCandidato {

    private String candidatoum;
    private String candidato;
    
   // String um;
    
  public void votar(Label candidatoum, Label candidato) {
    String cpf = candidatoum.getText();
    String voto = candidato.getText();
    String frase = "CPF " + cpf + " Voto: " + voto;
    String hash = generateHash(frase);

    salvarVotoNoArquivo(frase, hash);
}
    private String generateHash(String text) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = digest.digest(text.getBytes());
            StringBuilder hexString = new StringBuilder();

            for (byte b : hashBytes) {
                String hex = String.format("%02x", b);
                hexString.append(hex);
            }

            return hexString.toString();
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(ControllerCandidato.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public void salvarVotoNoArquivo(String frase, String hash) {
        try {
            FileWriter escreverNoArquivo = new FileWriter("teste.txt", true);
            PrintWriter imprimirNoArquivo = new PrintWriter(escreverNoArquivo);

            imprimirNoArquivo.println("Frase: " + frase + " Hash: " + hash);
            imprimirNoArquivo.println();
            escreverNoArquivo.flush();
            escreverNoArquivo.close();
            imprimirNoArquivo.close();
        } catch (IOException ex) {
            Logger.getLogger(ControllerCandidato.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
