/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Operacoes;

import contas.Conta;
import java.io.RandomAccessFile;

/**
 *
 * @author Cafer
 */
public class PagamentoFatura extends Operacao{
        
    public PagamentoFatura(Conta contaOrigem, float valor) {
        super(contaOrigem, valor);
    }

    @Override
    public void executar() {
       
    }

    @Override
    public void salva(RandomAccessFile out) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void le(RandomAccessFile in) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
