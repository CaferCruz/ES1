/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Operacoes;

import contas.Conta;
import java.util.Scanner;

/**
 *
 * @author Cafer
 */
public class MenuFuncionario {
    Scanner teclado = new Scanner(System.in);
    Conta usuario;
    
//--------------------------------Menu--------------------------------------
    
    
    
//-------------------------------Métodos------------------------------------
    
    
    public void sacar(){
        float valor;
        System.out.println("Informe o valor:");
        valor = teclado.nextFloat();
        Saque saque = new Saque(usuario, valor);
        saque.executar();
        usuario.salvarHistorico();
    }
}
