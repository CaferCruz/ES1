/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package banco;

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
    
    public void cadastrarCliente(Agencia agencia) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe o NOME do cliente: ");
        String nomeCliente = teclado.next() + teclado.nextLine();
        System.out.println("Informe o CPF do cliente: ");
        String cpfCliente = teclado.next() + teclado.nextLine();
        Cliente cliente = new Cliente(nomeCliente, cpfCliente);
        
        agencia.adicionaCliente(cliente);
        System.out.println("");
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
