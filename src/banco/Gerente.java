/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package banco;

import contas.Conta;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Romulo
 */
public class Gerente extends Funcionario{
    
    private final String senha = "d4ft";

    //-------------------- Construtores ----------------------------------------

    public Gerente(int matricula, String nome) {
        super(nome, matricula);
    }
    
    //-------------------- Metodos --------------------------------------------- 
    
    public boolean verificarSenha(String senha) {
        return this.senha.equals(senha);
    }
    
    public void salvarCliente(Agencia agencia, Cliente cliente) {
        agencia.adicionaCliente(cliente);
    }
    
        public void cadastrarCliente() {

    }
    
    public void listarClientes(Agencia agencia) {         
        agencia.getListaDeClientes();
    }
    
    //-------------------- to String -------------------------------------------
    
    @Override
    public String toString() {
        return super.toString();
    }
}
