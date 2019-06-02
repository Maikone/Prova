/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author adriano
 */
public abstract class RoupaDecorator  implements ProdutoRoupa {
    public abstract String getDescricaoDoProduto();
    public String getDescricao() {
        return ", " + getDescricaoDoProduto();
    }
}