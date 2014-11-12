/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contas;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Cafer
 */
public class CartaoCredito extends Conta {

    //o valor da fatura é dado pelo valor em conta
    //o valor é acrecido na fatura usando o creditar
    //a fatura é paga com o debitar
    //zero seria a fatura paga.
    public CartaoCredito(int idConta, float limite, String dataDeCriacao, float saldo, float taxaDeManutencao) {
        super(idConta, limite, dataDeCriacao, saldo, taxaDeManutencao);
    }
    

    @Override
    public void le(RandomAccessFile in) throws IOException {

    }

    @Override
    public void salva(RandomAccessFile out) throws IOException {
    }

}
