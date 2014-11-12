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
    protected String update;
    protected int tipoUpdate;

    public static final int OPERACAO = 1;
    public static final int ESTRUTURAL = 2;

    //---------------------------Construtor-------------------------------------
    public Conta(int idConta, float limite, String dataDeCriacao, float saldo, float taxaDeManutencao) {
        this.idConta = idConta;
        this.limite = limite;
        this.dataDeCriacao = dataDeCriacao;
        this.saldo = saldo;
        this.taxaDeManutencao = taxaDeManutencao;
        historico = new Historico(this);
    }

//    public Conta() {
//        historico = new Historico();
//    }

    //------------------ Getter e Setters --------------------------------------
    public void setLimite(float limite) {
        update = "Limite alterado.\n" + "Limite antigo: " + this.limite + " Limite atual: " + limite
                + "Data da alteração: " + Operacao.pegaData();
        this.tipoUpdate = ESTRUTURAL;
        this.limite = limite;
        salvarHistorico();
    }

    public float getLimite() {
        return limite;
    }

    public int getIdConta() {
        return idConta;
    }

    public String getDataDeCriacao() {
        return dataDeCriacao;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setUpdate(String update) {
        this.update = update;
    }

    public void setTipoUpdate(int tipoUpdate) {
        this.tipoUpdate = tipoUpdate;
    }

    public float getTaxaDeManutencao() {
        return taxaDeManutencao;
    }

    public void setTaxaDeManutencao(float taxaDeManutencao) {
        update = "Taxa de manutenção alterada.\n " + "Taxa anterior: " + this.getTaxaDeManutencao() + "Taxa atual: " + taxaDeManutencao
                + "\nData da alteração:" + Operacao.pegaData();
        tipoUpdate = ESTRUTURAL;
        this.taxaDeManutencao = taxaDeManutencao;
        salvarHistorico();
    }

    // ---------------------- Operações ----------------------------------------    
    public abstract void le(RandomAccessFile in) throws IOException;

    public abstract void salva(RandomAccessFile out) throws IOException;

    public void creditar(float valor) {
        this.saldo += valor;
    }

    public void debitar(float valor) {
        this.saldo -= valor;
    }

    public void salvarHistorico() {
        this.notifyObserver();
    }

    public String getUpdate() {
        return update;
    }

    public int getTipoUpdate() {
        return tipoUpdate;
    }

    //-------------------------Operações de Observable------------------------------------
    @Override
    public void addObserver(Observer o) {
        historico = new Historico(this);
    }

    @Override
    public void removeObserver(Observer o) {
        historico = null;
    }

    @Override
    public void notifyObserver() {
        this.historico.update();
    }
    // --------------------- toString ----------------------------------------

    @Override
    public String toString() {
        return "Numero: " + idConta + "-" + limite + " | "
                + "Saldo: " + saldo + " | "
                + "Taxa de manutenção: " + taxaDeManutencao;
    }

}
