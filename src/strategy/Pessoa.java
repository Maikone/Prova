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
public class Pessoa {

    private String nome;
    //private double valorCompra;
    private TipoDesconto tipoPessoa;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

   

    public TipoDesconto getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoDesconto tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

}
