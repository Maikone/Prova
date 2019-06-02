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
public class Jaqueta extends RoupaDecorator{

    
    public double getCusto() {
        return 12800;
    }
    public String getDescricaoDoProduto() {
        return "Jaqueta GG jacquard";
    }

  
    
}
