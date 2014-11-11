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
public class Emprestimo extends Operacao {

    public Emprestimo(Conta contaOrigem, float valor) {
        super(contaOrigem, valor);
    }

    @Override
    public void executar() {
        contaOrigem.creditar(valor);
        System.out.println("Empréstimo realizado com sucesso.");
    }

    @Override
    public void salva(RandomAccessFile out) throws IOException{
        out.writeUTF(this.toString());
    }

    @Override
    public String toString() {
        return "Operação: Empréstimo\n" + "Valor: " + this.getValor() +
                        "\nData da operação: " + this.getData();

    }
}
