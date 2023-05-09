package UrnaEletronica.Model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CandidatoTangerina extends Candidato {

    private List<String> votos = new ArrayList<>();
    private String hashnomeDoCandidato;

    public CandidatoTangerina(String nomeDoCandidato) {
        super(nomeDoCandidato);
        try {
            this.hashnomeDoCandidato = generateHash(nomeDoCandidato);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(CandidatoTangerina.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
  

    protected String generateHash(String text) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = digest.digest(text.getBytes());
        StringBuilder hexString = new StringBuilder();

        for (byte b : hashBytes) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1)
                hexString.append('0');
            hexString.append(hex);
        }

        return hexString.toString();
    }

    public String getHashNomeDoCandidato(String text) {
        return hashnomeDoCandidato;
    }

    public void votar(String eleitor) {
        votos.add(eleitor);
    }

    public String salvarVotosEmCandidatos() {
        try {
            FileWriter escreverNoArquivo = new FileWriter("votos.txt", true);
            PrintWriter imprimirNoArquivo = new PrintWriter(escreverNoArquivo);

            imprimirNoArquivo.println("CPF: " + this.nomeDoCandidato + "    " + "Hash do CPF: " + this.hashnomeDoCandidato);

            for (String voto : votos) {
                imprimirNoArquivo.println(voto);
            }

            escreverNoArquivo.flush();
            escreverNoArquivo.close();
            imprimirNoArquivo.close();
        } catch (IOException ex) {
            Logger.getLogger(CandidatoTangerina.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
