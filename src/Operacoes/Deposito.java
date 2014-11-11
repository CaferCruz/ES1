/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operacoes;

import contas.Conta;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Cafer
 */
public class Deposito extends Operacao {

    public Deposito(Conta contaOrigem, float valor) {
        super(contaOrigem, valor);
    }

    @Override
    public void executar() {
        System.out.println("Insira o dinheiro.");
        contaOrigem.creditar(valor);
    }

    @Override
    public void salva(RandomAccessFile out) throws IOException {
        out.writeUTF(this.toString());
    }

    @Override
    public String toString() {
        return "Operação: Deposito" + 
               "\nValor: " + this.getValor() + 
               "\nData: " + this.getData() + "\n";
    }
}
