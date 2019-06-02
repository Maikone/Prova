/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author michael
 */
public enum TipoPagamento implements Desconto {

    BOLETO {
        @Override
        public double calculaDesconto(double valor) {
            return valor;
        }
    },
    CREDITO {
        @Override
        public double calculaDesconto(double valor) {
           return valor = valor + (valor * 0.03);
           
        }
    },
    DEBITO {
        @Override
        public double calculaDesconto(double valor) {
            return valor;
        }
    },
    DINHEIRO {
        @Override
        public double calculaDesconto(double valor) {
            return valor;
        }
    };
}
