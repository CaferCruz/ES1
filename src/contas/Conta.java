/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contas;

import Observer.Observable;
import Observer.Observer;
import Operacoes.Operacao;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Romulo
 */
public abstract class Conta implements Observable {
    
    private int idConta;
    private int digito;
    private String dataDeCriacao; // a data sempre terá 10 caracteres exemplo 15/03/2014
    private float saldo;
    private float taxaDeManutencao;
    private Observer historico;
    
    //---------------------------Construtor-------------------------------------
    
    public Conta(int idConta, int digito, String dataDeCriacao, float saldo, float taxaDeManutencao) {
        this.idConta = idConta;
        this.digito = digito;
        this.dataDeCriacao = dataDeCriacao;
        this.saldo = saldo;
        this.taxaDeManutencao = taxaDeManutencao;
        historico = new Historico();
    }
    
    
    //------------------ Getter e Setters --------------------------------------

    public int getIdConta() {
        return idConta;
    }
    
    public int getDigito() {
        return digito;
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
    
    
    // ---------------------- Operações ----------------------------------------    
    
    public abstract void salva(RandomAccessFile out) throws IOException;   
    
    public void creditar(float valor){
        this.saldo += valor;
    }
    
    public void debitar(float valor){
        this.saldo -= valor;
    }

    //-------------------------Operações de Observable------------------------------------
    
    @Override
    public void addObserver(Observer o) {
        historico = new Historico();
    }

    @Override
    public void removeObserver(Observer o) {
        historico = null;
    }

    @Override
    public void notifyObserver(Operacao o) {
        this.historico.update(o);
    }
    
}
