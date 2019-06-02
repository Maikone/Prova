/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author ramazzotte
 */
public class Venda {
    private final Pessoa pessoa ;
     private final double valorCompra;
 
     public Venda(Pessoa pessoa, double valor) {
          this.pessoa = pessoa;
          this.valorCompra = valor;
     }
 
     public double calculaDesconto() {
 
          double desconto = 0.0;
          double valor1 = 0.0;
 
          TipoPessoa tp = this.pessoa.getTipoPessoa();
          TipoPagamento t = this.pessoa.getTipoPagamento();
          valor1 = tp.calculaDesconto(valorCompra) ;
          desconto =  t.calculaDesconto(valor1);
          
          
 
          return desconto;
 
     }
}
