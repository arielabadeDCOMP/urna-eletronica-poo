/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
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
public class Eleitor {

    
    String CPF; 
    
   

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    
    


    public String salvar()  {
        try{
        FileWriter escreverNoArquivo = new FileWriter("eleitores.txt",true);
        PrintWriter imprimirNoArquivo = new PrintWriter(escreverNoArquivo);
        
        imprimirNoArquivo.println("CPF: " + this.CPF);
        escreverNoArquivo.flush();
        escreverNoArquivo.close();
        imprimirNoArquivo.close();
        
    } catch (IOException ex) {
        Logger.getLogger(Eleitor.class.getName()).log(Level.SEVERE,null, ex);
    }
        return null;
    }
    /*
    
    public void mensagemSalva() {
        System.out.println("A mennsagem foi salva");
    }*/
}
