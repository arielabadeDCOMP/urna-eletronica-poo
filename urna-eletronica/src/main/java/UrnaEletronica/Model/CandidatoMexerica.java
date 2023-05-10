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

public class CandidatoMexerica extends Candidato {

    private List<String> votosMexerica = new ArrayList<>();
    private String hashNomeCandidatoMexerica;
    private static List<CandidatoMexerica> candidatosMexerica = new ArrayList<>();
    private static List<String> hashCandidatosMexerica = new ArrayList<>();

    public CandidatoMexerica(String nomeCandidatoMexerica) {
        super(nomeCandidatoMexerica);
        try {
            this.hashNomeCandidatoMexerica = generateHash(nomeCandidatoMexerica);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(CandidatoMexerica.class.getName()).log(Level.SEVERE, null, ex);
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

    public String getHashNomeCandidatoMexerica() {
        return hashNomeCandidatoMexerica;
    }

    public void votarMexerica(String eleitorMexerica) {
        votosMexerica.add(eleitorMexerica);
    }

    public String salvarVotosEmCandidatosMexerica() {
        try {
            candidatosMexerica.add(this);
            hashCandidatosMexerica.add(this.hashNomeCandidatoMexerica);
            FileWriter escreverNoArquivo = new FileWriter("votos.txt", true);
            PrintWriter imprimirNoArquivo = new PrintWriter(escreverNoArquivo);

            imprimirNoArquivo.println("Candidato: " + this.nomeDoCandidato + "Hash do Voto Do Candidato " + this.hashNomeCandidatoMexerica);
            

            for (String voto : votosMexerica) {
                imprimirNoArquivo.println(voto);
            }

            escreverNoArquivo.flush();
            escreverNoArquivo.close();
            imprimirNoArquivo.close();
        } catch (IOException ex) {
            Logger.getLogger(CandidatoMexerica.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static List<CandidatoMexerica> getCandidatosMexerica() {
        return candidatosMexerica;
    }

    public static List<String> getHashCandidatosMexerica() {
        return hashCandidatosMexerica;
    }

    public static int getNumeroDeCandidatosMexerica() {
        return candidatosMexerica.size();
    }
}
