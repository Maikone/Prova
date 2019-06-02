/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipoRoupa;

import Decorator.RoupaDecorator;

/**
 *
 * @author michael
 */
public class Camisa extends RoupaDecorator{
    public double getCusto() {
        return 1500;
    }
    public String getDescricaoDoProduto() {
        return "Camisa DSQUARED2 ";
    }
}
