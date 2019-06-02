/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provapoo;

import java.util.Random;
import java.util.Scanner;
import log.arquivoLog;
import observer.Compra10K;
import observer.Compra1K;
import observer.Soma;
import strategy.Pessoa;
import strategy.TipoPagamento;
import strategy.TipoPessoa;
import strategy.Venda;
import tipoRoupa.Jaqueta;
import tipoRoupa.Calca;
import tipoRoupa.Camisa;
import tipoRoupa.Vestido;

/**
 *
 * @author michael
 */
public class ProvaPOO {

    public ProvaPOO() {
        new arquivoLog("======================================");
        new arquivoLog("LOG iniciado");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Scanner sc = new Scanner(System.in);
        Roupa r = new Roupa("Efetuou Compra ");
        Pessoa p = new Pessoa();

        System.out.println("Digite seu Nome:");
        p.setNome(sc.next());

        new ProvaPOO();
        new arquivoLog("Nome do usuario:  " + p.getNome());
        new arquivoLog("Horario de acesso:  " + java.time.LocalDateTime.now().toString());

        System.out.println("  O que deja comprar? \n"
                + "Jaqueta de R$ 12800 = 1\n"
                + "Calça de R$ 50= 2\n"
                + "Vestido de R$ 90  = 3\n"
                + "Camisa de R$ 1500 ");

        for (int i = 1; i < 5; i++) {
            int op = sc.nextInt();
            if (op == 1) {
                r.add(new Jaqueta());
            } else if (op == 2) {
                r.add(new Calca());
            } else if (op == 3) {
                r.add(new Vestido());
            }else if(op == 4){
                r.add(new Camisa());
            }else if(op == 0){
                i= 4;
            } 
            
        }
        System.out.println("  Pessoa  \n"
                + "Fisica = 1\n"
                + "Juridica = 2\n");
        for (int i = 1; i < 2; i++) {
            int op = sc.nextInt();
            if (op == 1) {
                p.setTipoPessoa(TipoPessoa.FISICA);
            } else if (op == 2) {
                p.setTipoPessoa(TipoPessoa.JURIDICA);
            }

        }
        System.out.println("  Tipo de pagamento  \n"
                + "Boleto = 1\n"
                + "Cartao de credito = 2\n"
                + "Cartao debito = 3\n"
                + "Dinheiro = 4 \n");

        for (int i = 1; i < 2; i++) {
            int op = sc.nextInt();
            if (op == 1) {
                p.setTipoPagamento(TipoPagamento.BOLETO);
            } else if (op == 2) {
                p.setTipoPagamento(TipoPagamento.CREDITO);
            } else if (op == 3) {
                p.setTipoPagamento(TipoPagamento.DEBITO);
            } else if (op == 4) {
                p.setTipoPagamento(TipoPagamento.DINHEIRO);
            }

        }
        
        Random gerador = new Random();  
        System.out.println("Nota fiscal:" + gerador.nextInt(10000000));
        Venda novaVenda = new Venda(p, r.getCusto());
        System.out.println("Descricao: " + r.getDescricao());
        System.out.println("Valor Total da Compra: " + novaVenda.calculaDesconto());
        new arquivoLog(r.getDescricao());
        
          
        
        Soma s = Soma.getInstance();

        s.setNum(r.getCusto());
        Compra10K par = new Compra10K();
        Compra1K impar = new Compra1K();

        s.addObserver(par);
        s.addObserver(impar);    
    }

}
