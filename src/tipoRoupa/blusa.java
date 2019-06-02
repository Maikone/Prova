/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipoRoupa;

import Decorator.Compra;
import Decorator.ProdutoRoupa;
import Decorator.RoupaDecorator;



/**
 *
 * @author michael
 */
public class blusa extends RoupaDecorator{

    
    public double getCusto() {
        return 30;
    }
    public String getDescricaoDoProduto() {
        return "Blusa de Frio";
    }

  
    
}
