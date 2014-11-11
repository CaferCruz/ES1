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
public abstract class Funcionario {
    
    private final String nome;
    private final int matricula;

    public Funcionario(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }    
    
    
    @Override
    public String toString() {
        return nome + " " + matricula;
    }
}
