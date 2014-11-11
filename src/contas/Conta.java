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
 * @author Romulo
 */
public abstract class Conta {
    
    private int idConta;
    private int digito;
    private String dataDeCriacao; // a data sempre terá 10 caracteres exemplo 15/03/2014
    private float saldo;
    private float taxaDeManutencao;
    
    
    //------------------ Getter e Setters ------------------------------------

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta, int digito) {
        this.digito = digito;
        this.idConta = idConta;
    }

    public String getDataDeCriacao() {
        return dataDeCriacao;
    }

    public void setDataDeCriacao(String dataDeCriacao) {
        this.dataDeCriacao = dataDeCriacao;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getTaxaDeManutencao() {
        return taxaDeManutencao;
    }

    public void setTaxaDeManutencao(float taxaDeManutencao) {
        this.taxaDeManutencao = taxaDeManutencao;
    }    
    
    
    // ---------------------- Operações --------------------------------------    
    
    public void salva(RandomAccessFile out) throws IOException {
        out.writeInt(idConta);
        out.writeInt(digito);
        out.writeUTF(dataDeCriacao);
        out.writeFloat(saldo);
        out.writeFloat(taxaDeManutencao);
    }
    
}
