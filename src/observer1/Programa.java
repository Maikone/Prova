/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer1;

/**
 *
 * @author ramazzotte
 */
public class Programa {
    public static void main(String[] args) {
        Soma s = Soma.getInstance();

        Par par = new Par();
        Impar impar = new Impar();

        s.addObserver(par);
        s.addObserver(impar);       
    }
}