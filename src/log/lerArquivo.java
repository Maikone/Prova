/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package log;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author michael
 */
public class lerArquivo {

    FileReader fileR;
    BufferedReader buff;

    public lerArquivo() {

        try {
            fileR = new FileReader("arquivo.txt");
            buff = new BufferedReader(fileR);
            while (buff.ready()) {
                System.out.println(buff.readLine());
            }
            buff.close();
        } catch (IOException e) {
            System.out.println("...erro" + e.getMessage());
        }
    }
}
