/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package banco;

/**
 *
 * @author Romulo
 */
public class Gerente extends Funcionario{
    
    private String nome;
    private int matricula;
    private final String senha = "d4ft";

    public Gerente() { }
    
    //-------------------- Metodos --------------------------------------------- 
    
    public boolean verificarSenha(String senha) {
        return senha.equals(senha);
    }
    
    //-------------------- to String -------------------------------------------
    
    @Override
    public String toString() {
        return nome + " " + matricula;
    }
}
