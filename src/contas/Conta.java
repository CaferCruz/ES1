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
    private float limite;
    private String dataDeCriacao; // a data sempre terá 10 caracteres exemplo 15/03/2014
    private float saldo;
    private float taxaDeManutencao;
    private Observer historico;
    
    //---------------------------Construtor-------------------------------------
    
    public Conta(int idConta, float limite, String dataDeCriacao, float saldo, float taxaDeManutencao) {
        this.idConta = idConta;
        this.limite = limite;
        this.dataDeCriacao = dataDeCriacao;
        this.saldo = saldo;
        this.taxaDeManutencao = taxaDeManutencao;
        historico = new Historico();
    }
    
    public Conta() {
        historico = new Historico();
    }
    
    
    //------------------ Getter e Setters --------------------------------------

    public void setLimite(float limite) {
        this.limite = limite;
    }
    
    public float getLimite() {
        return limite;
    }

    public int getIdConta() {
        return idConta;
    }
    
    public void setIdConta(int idConta) {
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
    
    public abstract void le(RandomAccessFile in) throws IOException;
    
    public abstract void salva(RandomAccessFile out) throws IOException;   
    
    public void creditar(float valor){
        this.saldo += valor;
    }
    
    public void debitar(float valor){
        this.saldo -= valor;
    }
     public void salvarHistorico(Operacao o){
         this.notifyObserver(o);
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
    
    // --------------------- toString ----------------------------------------
    
    @Override
    public String toString() {
        return "Numero: " + idConta + "-" + limite + " | " +
                "Saldo: " + saldo + " | " + 
                "Taxa de manutenção: " + taxaDeManutencao;
    }
    
}
