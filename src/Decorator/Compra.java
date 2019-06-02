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
public abstract class Compra implements ProdutoRoupa {

    private String descricao;
    private double custo;

    //protected abstract double getPrecoDaCompra();

    // Construtor da classe com String como parâmetro 
    protected Compra(String descricao) {
        this.descricao = descricao;
      //  this.custo = getPrecoDaCompra();
    }

    public double getCusto() {
        return custo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void add(ProdutoRoupa complemento) {
        custo += complemento.getCusto();
        descricao += complemento.getDescricao();
    }
}
