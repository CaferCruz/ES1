/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operacoes;

import contas.*;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author Cafer
 */
public class Saque implements Operacao {

    private final Conta contaDestino;
    private final Date data;
    private final float valor;
    public Saque(Conta contaDestino, float valor) {
        this.contaDestino = contaDestino;
        this.valor = valor;
        this.data = pegaData();
    }

    
    
    
    
    @Override
    public void executar() {
     contaDestino.debitar(valor);
        System.out.println("Por favor retire o dinheiro.");
    }

    private Date pegaData() {

        return Calendar.getInstance().getTime();
        
    }
}
