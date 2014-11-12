/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Operacoes;

import contas.Conta;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Cafer
 */
public abstract class Operacao {
    protected Conta contaOrigem;
    protected String data;
    protected float valor;

    //-------------------------Construtor---------------------------------------
    public Operacao(Conta contaOrigem, float valor) {
        this.contaOrigem = contaOrigem;
        this.data = pegaData();
        this.valor = valor;
    }
    
    //-------------------------Metodo Estatico----------------------------------
    public static String pegaData(){
        Date d = Calendar.getInstance().getTime();
        DateFormat f = new SimpleDateFormat("dd/MM/YYYY");
        DateFormat h = new SimpleDateFormat("HH:mm:ss");
        return f.format(d) +" "+h.format(d);
    }
    //-------------------------Metodos Abstratos--------------------------------
    public abstract void executar();
    public abstract void salva(RandomAccessFile out)throws IOException;
    //-------------------------Getters e Setters--------------------------------
    public Conta getContaOrigem() {
        return contaOrigem;
    }

    public String getData() {
        return data;
    }

    public float getValor() {
        return valor;
    }
    
    
    
    
    
    
    
}
