/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provapoo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import log.arquivoLog;
import strategy.Pessoa;
import strategy.TipoDesconto;
import strategy.Venda;
import tipoRoupa.calca;

/**
 *
 * @author michael
 */
public class ProvaPOO {

    public ProvaPOO(){
        new arquivoLog("LOG iniciado");
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Roupa r = new Roupa("roupinha");
        //r.add(new blusa());
        r.add(new calca());

        System.out.println("Descricao: " + r.getDescricao());
        System.out.println("Total:  R$ " + r.getCusto());

        Pessoa atendente = new Pessoa();
        atendente.setNome("Maria da Silva");
        // atendente.setValorCompra(r.getCusto());
        atendente.setTipoPessoa(TipoDesconto.FISICA);

        Venda novaVenda = new Venda(atendente, r.getCusto());

        System.out.println("valor com desconto: "
                + novaVenda.calculaDesconto());
        
        
        new ProvaPOO();
        new arquivoLog(r.getDescricao());
        arquivoLog arquivoLog = new arquivoLog(java.time.LocalDateTime.now().toString());
        
        
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Scanner sc = new Scanner(System.in);
        
        

    }

}
