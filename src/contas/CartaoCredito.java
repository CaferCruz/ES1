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

    private float valorTotal = 0;

    public CartaoCredito(int idConta, float limite, String dataDeCriacao, float saldo, float taxaDeManutencao) {
        super(idConta, limite, dataDeCriacao, saldo, taxaDeManutencao);
    }
    
    public CartaoCredito() {
    }

    @Override
    public void le(RandomAccessFile in) throws IOException {

    }

    @Override
    public void salva(RandomAccessFile out) throws IOException {
    }

}
