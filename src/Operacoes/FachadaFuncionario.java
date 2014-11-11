/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operacoes;

import banco.Agencia;
import contas.Conta;
import java.util.Scanner;

/**
 *
 * @author Cafer
 */
public class FachadaFuncionario {

    private final Scanner teclado = new Scanner(System.in);
    private final Conta cliente;
    private Operacao operacao;
    private float valor;
    private boolean feito = false;
//------------------------------Construtor--------------------------------------

    public FachadaFuncionario(Conta usuario) {
        this.cliente = usuario;
    }
//-------------------------------Métodos----------------------------------------

    public void sacar() {
        while (!feito) {
            System.out.println("Informe o valor:");
            valor = teclado.nextFloat();
            if (valor == 0) {
                System.out.println("Operação cancelada, retornando ao menu.");
                return;
            }
            if (valor < cliente.getSaldo()) {
                operacao = new Saque(cliente, valor);
                operacao.executar();
                cliente.salvarHistorico(operacao);
                feito = true;
            } else {
                System.out.println("Saldo insuficiente.");
            }

        }
    }

    public void depositar() {

        System.out.println("Informe o valor");
        valor = teclado.nextFloat();
        if (valor == 0) {
            System.out.println("Operação cancelada. Retornando ao menu.");
            return;
        }
        operacao = new Deposito(cliente, valor);
        operacao.executar();
        cliente.salvarHistorico(operacao);

    }

    public void transferir() {
        System.out.println("informe o valor");
        
    
    
    }
    
    public void emprestar(){};
    
    public void pagarCartao(){};
    
    public void pagarFatura(){};
}
