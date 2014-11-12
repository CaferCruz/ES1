/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operacoes;

import banco.Banco;
import banco.Funcionario;
import contas.CartaoCredito;
import contas.Conta;
import java.util.Scanner;

/**
 *
 * @author Cafer
 */
public class FachadaOperacoes {

    private final Scanner teclado = new Scanner(System.in);
    private final Conta cliente;
    private final Funcionario funcionario;
    private Operacao operacao;
    private float valor;
    private boolean feito = false;

//------------------------------Construtor--------------------------------------
    public FachadaOperacoes(Conta usuario, Funcionario funcionario) {
        this.cliente = usuario;
        this.funcionario = funcionario;
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
                cliente.setUpdate(operacao.toString());
                cliente.setTipoUpdate(Conta.OPERACAO);
                cliente.salvarHistorico();
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
        cliente.setUpdate(operacao.toString());
        cliente.setTipoUpdate(Conta.OPERACAO);
        cliente.salvarHistorico();

    }

    public void transferir() {
        System.out.println("informe o valor");

    }

    public void emprestar() {
    }

    ;
    
    public void pagarComCartao() {
        System.out.println("Informe o valor");
        valor = teclado.nextFloat();
        if (valor == 0) {
            System.out.println("Operação cancelada. Retornando ao menu.");
            return;
        }
        //Uso credito, todo o valor passado terá amazenado no saldo da conta e esta que deverá ser paga.

        if ((this.cliente.getSaldo() + valor) > this.cliente.getLimite()) {
            System.out.println("Limite indisponível.");
            return;
        }
        operacao = new PagamentoComCartao(cliente, valor);
        operacao.executar();
        cliente.setUpdate(operacao.toString());
        cliente.setTipoUpdate(Conta.OPERACAO);
        cliente.salvarHistorico();
    }

    public void pagarFatura() {
        //Codigo da fatura.
        System.out.println("Informe o numero da fatura");
        int cod = teclado.nextInt();
        //buscar a fatura na lista de faturas do banco
        CartaoCredito cC = Banco.getClientePorFatura(cod);
        //Fatura válida
        if (cC != null) {
            System.out.println("Informe o valor:");
            valor = teclado.nextFloat();
            operacao = new PagamentoFatura(cC, valor);
            operacao.executar();
            cliente.setUpdate(operacao.toString());
            cliente.setTipoUpdate(Conta.OPERACAO);
            cliente.salvarHistorico();
        }
    }
}
