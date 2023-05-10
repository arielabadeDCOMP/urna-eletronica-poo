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

public class CandidatoBergamota extends Candidato {

    private List<String> votosBergamota = new ArrayList<>();
    private String hashNomeCandidatoBergamota;
    private static List<CandidatoBergamota> candidatosBergamota = new ArrayList<>();
    private static List<String> hashCandidatosBergamota = new ArrayList<>();

    public CandidatoBergamota(String nomeCandidatoBergamota) {
        super(nomeCandidatoBergamota);
        try {
            this.hashNomeCandidatoBergamota = generateHash(nomeCandidatoBergamota);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(CandidatoBergamota.class.getName()).log(Level.SEVERE, null, ex);
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

    public String getHashNomeCandidatoBergamota(String text) {
        return hashNomeCandidatoBergamota;
    }

    public void votarBergamota(String eleitorBergamota) {
        votosBergamota.add(eleitorBergamota);
    }

    public String salvarVotosEmCandidatosBergamota() {
        try {
            candidatosBergamota.add(this);
            hashCandidatosBergamota.add(this.hashNomeCandidatoBergamota);
            FileWriter escreverNoArquivo = new FileWriter("votos.txt", true);
            PrintWriter imprimirNoArquivo = new PrintWriter(escreverNoArquivo);

            imprimirNoArquivo.println("Voto: " + this.nomeDoCandidato + "Hash Voto: " + this.hashNomeCandidatoBergamota);
            

            for (String voto : votosBergamota) {
                imprimirNoArquivo.println(voto);
            }

            escreverNoArquivo.flush();
            escreverNoArquivo.close();
            imprimirNoArquivo.close();
        } catch (IOException ex) {
            Logger.getLogger(CandidatoBergamota.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static List<CandidatoBergamota> getCandidatosBergamota() {
        return candidatosBergamota;
    }

    public static List<String> getHashCandidatosBergamota() {
        return hashCandidatosBergamota;
    }

    public static int getNumeroDeCandidatosBergamota() {
        return candidatosBergamota.size();
    }
}