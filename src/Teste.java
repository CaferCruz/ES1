
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import contas.*;
import java.io.*;
import java.util.*;


/**
 *
 * @author Romulo
 */
public class Teste {
    
    public static String NOME_ARQUIVO = "contas.dat";
    
    public static void main(String[] args) throws IOException {
        
        
        
        List<Conta> contas = new ArrayList<>();
        RandomAccessFile arquivo = null;
        
        contas.add(new ContaCorrente(1234, 67, "15/08/1995", 3500, 0.2f));
        contas.add(new ContaCorrente(1970, 11, "24/03/2001", 4700, 0.2f));
        contas.add(new ContaCorrente(2986, 34, "15/08/2005", 3500, 0.2f));
        contas.add(new ContaCorrente(5763, 93, "15/08/1998", 3500, 0.2f));
        contas.add(new ContaCorrente(5229, 12, "15/08/1998", 1450, 0.15f));
        
        salvarEmArquivo(contas, arquivo);
        
        lerArquivo(contas, arquivo);
        
    }

    private static void salvarEmArquivo(List<Conta> contas, RandomAccessFile arquivo) throws IOException {
        try {
            arquivo = new RandomAccessFile(new File(NOME_ARQUIVO), "rw");
            
            for (Conta conta : contas) {
                conta.salva(arquivo);
            }            
        } catch(IOException e) {
            
        } finally {
            if(arquivo != null) {
                arquivo.close();
            }
        }
    }

    private static void lerArquivo(List<Conta> contas, RandomAccessFile arquivo) throws IOException {
        try {
            arquivo = new RandomAccessFile(new File(NOME_ARQUIVO), "rw");
            
            while(true) {
                Conta c = new ContaCorrente();
                c.le(arquivo);
                System.out.println(c);
            }
            
        } catch(IOException e) {
            System.out.println(e);
        } finally {
            if(arquivo != null) {
                arquivo.close();
            }
        }
    }
    
}
