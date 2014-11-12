/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package banco;

import contas.Conta;
import java.util.List;

/**
 *
 * @author Romulo
 */
public class Cliente {
    
    private String nome;
    private String cpf;
    private Conta conta;

    public Cliente() {
    }

    public Cliente(String nome, String cpf, Conta conta) {
        this.nome = nome;
        this.cpf = cpf;
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
    
    // ---------------- getters e setters --------------------------------------

    public Conta getContas() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta ;
    }
    
    //------------------ to String ---------------------------------------------
    
    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
                "CPF: " + cpf + "\n" +
                conta.toString();

    }
    
}
