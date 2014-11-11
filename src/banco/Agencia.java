/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package banco;

import java.util.*;

/**
 *
 * @author Romulo
 */
public class Agencia {
    
    private final int codigo;
    private final String endereco;
    
    private final Map<String,Cliente> clientes;
    
    // --------------------- Construtores --------------------------------------

    public Agencia(int codigo, String endereco) {
        this.codigo = codigo;
        this.endereco = endereco;
        clientes = new HashMap<>();
    }    
    
    
    // -------------------- Metodos --------------------------------------------
    
    public void adicionaCliente(Cliente cliente) {
        if(!clientes.containsKey(cliente.getCpf())) {
            clientes.put(cliente.getCpf(), cliente);            
        }
        else {
            System.out.println("** Já existe um cliente com este CPF! **");
        }
    }
    
    public Cliente getCliente(String cpf) {
        return clientes.get(cpf);
    }
    
    public Map<String, Cliente> getListaDeClientes() {
        return clientes;
    }
    
    //--------------------- to String ------------------------------------------
    
    @Override
    public String toString() {
        return codigo + " " + endereco;
    }
       
}
