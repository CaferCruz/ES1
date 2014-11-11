package menu;


import banco.Gerente;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Romulo
 */
public class Menu {
    
    private static final Scanner teclado = new Scanner(System.in);
    
    private static final String MENU_INICIAL = 
            "1 - Gerente \n" + 
            "2 - FuncionarioCaixa \n" +
            "3 - Cliente \n" +
            "0 - Sair \n";
    
    private static final String MENU_GERENTE = 
            "1 - Cadastrar cliente \n" + 
            "2 - Realizar emprestimo \n" + 
            "3 - Listar clientes \n" + 
            "0 - voltar \n";
    
    private static final String MENU_FUNCIONARIO =
            "1 - Saque \n" +
            "2 - Deposito \n" +
            "3 - Transferencia \n" +
            "0 - voltar";
    
    //-------------------- Main ------------------------------------------------
    
    public static void main(String[] args) {        
        
        boolean sair = false;                
                
        System.out.println("** Bem vindo ao BankLine **");               
        while(!sair) {            
            System.out.println(MENU_INICIAL);
            
            System.out.print("digite sua opção: ");
            int opcao = teclado.nextInt();            
            switch(opcao) {
                case 1:
                    operacoesGerente();
                    break;
                case 2:
                    operacoesFuncionario();
                    break;
                case 3:
                    operacoesCliente();
                    break;
                case 0:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida =/");
                    break;
            }
        }
        System.out.println("** Fim **");
        
    }
    
    // --------------------- Metodos -------------------------------------------

    private static void operacoesGerente() {
        Gerente g = new Gerente();
        System.out.println("** Bem vindo Gerente **");
        System.out.print("Digite sua senha: ");
        String senha = teclado.nextLine();
        
        if(!g.verificarSenha(senha)) {
            System.out.println("** Senha incorreta! **");
        }
        else {
            boolean sair = false;
            
            while(!sair) {
                System.out.println(MENU_GERENTE);
                
                System.out.print("digite sua opção: ");
                int opcao = teclado.nextInt();
                switch(opcao) {
                    case 1:
                        // cadastrar cliente 
                        break;
                    case 2:
                        // realizar emprestimo
                        break;
                    case 3:
                        // listar clientes
                        break;
                    case 0: 
                        // voltar ao menu principal
                        sair = true;
                        break;
                    default:
                        System.out.println("Opção inválida =/");
                        break;
                }        
            }                
        }
        
    }

    private static void operacoesFuncionario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void operacoesCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
