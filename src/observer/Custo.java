/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;
/**
 *
 * @author michael
 */
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Custo extends Observable implements Runnable {

    private double num;
    public static Custo instance = null;

    private Custo() {
        num = 0;
    }

    public static Custo getInstance() {
        if (instance == null) {
            instance = new Custo();
            Thread t1 = new Thread(instance);
            t1.start();
        }
        return instance;
    }

    public void setNum(double num) {
        this.num = num;
        setChanged(); // marca esse objeto observável como alterado  
        notifyObservers(); // notifica todos os observadores que esse objeto foi alterado
    }

    public double getNum() {
        return num;
    }

    private void verificar() {

        while (true) {
            setNum(num);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Custo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    @Override
    public void run() {
        verificar();
    }
}