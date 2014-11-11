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
    private List<Conta> contas;

    public Cliente() {
    }

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    // ---------------- getters e setters --------------------------------------

    public List<Conta> getContas() {
        return contas;
    }

    public void setConta(Conta conta) {
        this.contas.add(conta);
    }
    
    //------------------ to String ---------------------------------------------
    
    @Override
    public String toString() {
        return null;
    }
    
}
