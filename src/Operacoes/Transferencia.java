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
public class Transferencia extends Operacao {

    private final Conta contaDestino;

    public Transferencia(Conta contaOrigem, Conta contaDestino, float valor) {
        super(contaOrigem, valor);
        this.contaDestino = contaDestino;
    }

    @Override
    public void executar() {
        this.contaOrigem.debitar(valor);
        this.contaDestino.creditar(valor);
        System.out.println("Transferencia realizada com sucesso");
    }

    @Override
    public void salva(RandomAccessFile out) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void le(RandomAccessFile in) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
