/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import contas.CartaoCredito;
import contas.Conta;
import contas.ContaCorrente;
import contas.ContaPoupanca;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cafer
 */
public class Banco {

    //Para localizar a conta corrente da respectiva fatura
    //é indicada com os 4 primeiros digitos do codigo
    //O codigo deve possuir 8 digitos
    private static List<CartaoCredito> cliCartaoCredito = new ArrayList<>();
    private static List<ContaCorrente> cliContaCorrente = new ArrayList<>();
    private static List<ContaPoupanca> cliContaPoupanca = new ArrayList<>();
    private static List<Gerente> gerente = new ArrayList<>();
    private static List<Caixa> caixa = new ArrayList<>();

    private String nome;

    public Banco(String nome) {
        this.nome = nome;
    }
    
    public void criarBanco(){
        //Criar Cliente do tipo Conta Corrente
        addCartaoCredito(new CartaoCredito(111, 1.000f, "12/11/2014", 100.0f, 0.5f));
    }
    
    public void addCartaoCredito(CartaoCredito cliCartaoCredito) {
        Banco.cliCartaoCredito.add(cliCartaoCredito);
    }

    public boolean isCartaoCredito(CartaoCredito cliCartaoCredito) {
        return Banco.cliCartaoCredito.contains(cliCartaoCredito);
    }

    public static CartaoCredito getClientePorFatura(int codFatura) {
        for (CartaoCredito cc : cliCartaoCredito) {
            if (cc.getIdConta() == codFatura / 10000) {
                return cc;
            }
        }
        return null;
    }

    public void addContaCorrente(ContaCorrente cliContaCorrente) {
        Banco.cliContaCorrente.add(cliContaCorrente);
    }

    public boolean isContaCorrente(ContaCorrente cliContaCorrente) {
        return Banco.cliContaCorrente.contains(cliContaCorrente);
    }

    public void addContaPoupanca(ContaPoupanca cliContaPoupanca) {
        Banco.cliContaPoupanca.add(cliContaPoupanca);
    }

    public boolean isContaPoupanca(ContaPoupanca cliContaPoupanca) {
        return Banco.cliContaPoupanca.contains(cliContaPoupanca);
    }
}
