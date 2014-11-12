package menu;


import banco.Agencia;
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
    
    private static final String MENU_INICIAL = 
            "1 - Gerente \n" + 
            "2 - FuncionarioCaixa \n" +
            "3 - Cliente \n" +
            "0 - Sair \n" +
            "digite uma opção->";
    
    private static final String MENU_GERENTE = 
            "1 - Cadastrar cliente \n" + 
            "2 - Realizar emprestimo \n" + 
            "3 - Listar clientes \n" + 
            "0 - voltar \n" +
            "digite uma opção -> ";
    
    private static final String MENU_FUNCIONARIO =
            "1 - Saque \n" +
            "2 - Deposito \n" +
            "3 - Transferencia \n" +
            "0 - voltar \n" + 
            "digite uma opção ->";
    
    private static final String MENU_CAIXA_ELETRONICO = 
            "1 - Saque \n" +
            "2 - Deposito \n" +
            "3 - Transferencia \n" +
            "0 - voltar \n" +
            "digite uma opção ->";
    
    private static final Scanner teclado = new Scanner(System.in);    
    
    private static Agencia agencia = new Agencia(555, "Av. São Sebastião, Niteroi, RJ");
    private static Gerente gerente = new Gerente(1234, "Carlos de Souza");
    //-------------------- Main ------------------------------------------------
    
    public static void main(String[] args) {             
        
        boolean sair = false;                
                
        System.out.println("** Bem vindo ao BankLine **\n");               
        while(!sair) {            
            System.out.println("--- MENU PRINCIPAL ---");
            System.out.println(MENU_INICIAL);            
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
            System.out.println();
        }
        System.out.println("** Fim **");
        
    }
    
    // --------------------- Metodos -------------------------------------------

    private static void operacoesGerente() {

        System.out.println("** Bem vindo Gerente **");
        System.out.print("Digite sua senha -> ");
        String senha = teclado.next() + teclado.nextLine();
        
        if(!gerente.verificarSenha(senha)) {
            System.out.println("** Senha incorreta! **");
        }
        else {
            boolean sair = false;
            System.out.println("");
            while(!sair) {
                System.out.println("--- MENU GERENTE ---");
                System.out.println(MENU_GERENTE);
                int opcao = teclado.nextInt();
                switch(opcao) {
                    case 1:
                        // cadastrar cliente
                        gerente.cadastrarCliente(agencia);                        
                        break;
                    case 2:
                        // realizar emprestimo
                        break;
                    case 3:
                        // listar clientes
                        gerente.listarClientes(agencia);
                        break;
                    case 0: 
                        // voltar ao menu principal
                        sair = true;
                        break;
                    default:
                        System.out.println("Opção inválida =/");
                        break;
                }
                System.out.println();
            }                
        }
        
    }

    private static void operacoesFuncionario() {
        
        System.out.println("** Bem vindo Funcionario **");
        System.out.print("Digite sua senha -> ");
        String senha = teclado.next() + teclado.nextLine();
        
        if(!gerente.verificarSenha(senha)) {
            System.out.println("** Senha incorreta! **");
        }
        else {
            boolean sair = false;
            System.out.println("");
            while(!sair) {
                System.out.println("--- MENU FUNCIONARIO ---");
                System.out.println(MENU_FUNCIONARIO);
                int opcao = teclado.nextInt();
                switch(opcao) {
                    case 1:
                        // saque                        
                        break;
                    case 2:
                        // deposito
                        break;
                    case 3:
                        // transferencia
                        break;
                    case 0: 
                        // voltar ao menu principal
                        sair = true;
                        break;
                    default:
                        System.out.println("Opção inválida =/");
                        break;
                }
                System.out.println();
            }                
        }
    }

    private static void operacoesCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
