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
public enum TipoPessoa implements Desconto {
    
      
    FISICA {
         @Override
         public double calculaDesconto(double valor) {
              return valor = valor - (valor * 0.05);
         }
    },
    JURIDICA {
         @Override
         public double calculaDesconto(double valor) {
             return valor = valor -(valor * 0.10) ;
             
         }
    },
      CARTAOCREDITO {
         @Override
         public double calculaDesconto(double valor) {
              return valor =  valor + (valor * 0.03) ;
         }
    };
}
