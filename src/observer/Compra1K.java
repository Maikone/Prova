/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author ramazzotte
 */
import java.util.Observable;
import java.util.Observer;

public class Compra1K implements Observer {

    private Soma s = Soma.getInstance();

    @Override
    public void update(Observable o, Object arg) {

        if (s.getNum() >= 1000 && s.getNum() <10000) {
            System.out.println("Gerente A sendo chamado, cliente classificado pela compra de 1000");
        }

    }
}