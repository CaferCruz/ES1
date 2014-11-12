/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operacoes;

import contas.*;
import java.io.RandomAccessFile;

/**
 *
 * @author Cafer
 */
public class Saque extends Operacao {

    public Saque(Conta conta, float valor) {
        super(conta, valor);
    }

    @Override
    public void executar() {
        contaOrigem.debitar(valor);
        System.out.println("Por favor retire o dinheiro.");
    }

    @Override
    public void salva(RandomAccessFile out) {
        
    }

    public void le(RandomAccessFile in) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString(){
        return "Operação: Saque" + 
                "\nValor: " + this.getValor() +
                "\nData: " + this.getData();
    }
    
}
