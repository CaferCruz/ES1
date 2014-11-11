/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Romulo
 */
public class Teste {
    
    public static void main(String[] args) {
        
        List<String> nomes = new ArrayList<>();
        
        nomes.add("Joana");
        nomes.add("Mateus");
        nomes.add("Mariana");
        nomes.add("Roberta");
        nomes.add("Vanessa");
        nomes.add("Adriana");
        
        System.out.println(nomes.contains("Lucas"));
        System.out.println(nomes.indexOf("Vanessa"));
        
    }
    
}
