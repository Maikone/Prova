/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package log;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author michael
 */
public class escreverArquivo {

    FileWriter fileR;
    BufferedWriter buff;
    
    public escreverArquivo() {
        try {
            fileR = new FileWriter("arquivo.txt");
            buff = new BufferedWriter(fileR);
            buff.newLine();
            buff.write("dfquwhdiuwqdh");
            buff.close();
        } catch (IOException e) {
            Logger.getLogger(escreverArquivo.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
}
