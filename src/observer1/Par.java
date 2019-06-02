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
import java.util.Observable;
import java.util.Observer;

public class Par implements Observer {

    private Soma s = Soma.getInstance();

    @Override
    public void update(Observable o, Object arg) {

        if (s.getNum() % 2 == 0) {
            System.out.println(s.getNum() + " é Par");
        }

    }
}
