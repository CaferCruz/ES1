/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contas;

import java.util.Date;

/**
 *
 * @author Romulo
 */
public abstract class Conta {
    
    private int idConta;
    private int digito;
    private Date dataDeCriacao;
    private float saldo;
    private float taxaDeManutencao;

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta, int digito) {
        this.digito = digito;
        this.idConta = idConta;
    }

    public Date getDataDeCriacao() {
        return dataDeCriacao;
    }

    public void setDataDeCriacao(Date dataDeCriacao) {
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
    
    
}
