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
    private final Pessoa funcionario;
     private final double valor;
 
     public Venda(Pessoa funcionario, double valor) {
          this.funcionario = funcionario;
          this.valor = valor;
     }
 
     public double calculaDesconto() {
 
          double comissao = 0.0;
 
          TipoDesconto cargo = this.funcionario.getTipoPessoa();
          comissao = cargo.calculaDesconto(valor);
 
          return comissao;
 
     }
}
