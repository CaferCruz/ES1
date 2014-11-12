package menu;

import Operacoes.Operacao;
import banco.Agencia;
import banco.Cliente;
import banco.Gerente;
import contas.Conta;
import contas.ContaCorrente;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Grupo F
 */
public class Menu {

    private static final String MENU_INICIAL
            = "1 - Gerente \n"
            + "2 - FuncionarioCaixa \n"
            + "3 - Cliente \n"
            + "0 - Sair \n"
            + "digite a opção->";

    private static final String MENU_GERENTE
            = "1 - Cadastrar cliente \n"
            + "2 - Realizar emprestimo \n"
            + "3 - Listar clientes \n"
            + "0 - voltar \n"
            + "digite a opção -> ";

    private static final String MENU_FUNCIONARIO
            = "1 - Saque \n"
            + "2 - Deposito \n"
            + "3 - Transferencia \n"
            + "0 - voltar"
            + "digite a opção ->";

    private static final String MENU_TIPO_CONTA
            = "Escolha o tipo da conta: \n"
            + "1 - Conta Corrente \n"
            + "2 - Conta Poupanca \n"
            + "3 - Cartão de Credito \n"
            + "digite a opção->";

    private static final Scanner teclado = new Scanner(System.in);

    //-------------------- Main ------------------------------------------------
    public static void main(String[] args) {

        Agencia agencia = new Agencia(555, "Av. São Sebastião, Niteroi, RJ");
        Gerente gerente = new Gerente(1234, "Carlos de Souza");

        boolean sair = false;

        System.out.println("** Bem vindo ao BankLine **\n");
        while (!sair) {
            System.out.println("--- MENU PRINCIPAL ---");
            System.out.println(MENU_INICIAL);
            int opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    operacoesGerente(gerente, agencia);
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
    private static void operacoesGerente(Gerente gerente, Agencia agencia) {

        System.out.println("** Bem vindo Gerente **");
        System.out.print("Digite sua senha: ");
        String senha = teclado.next() + teclado.nextLine();

        if (!gerente.verificarSenha(senha)) {
            System.out.println("** Senha incorreta! **");
        } else {
            boolean sair = false;
            System.out.println("");
            while (!sair) {
                System.out.println("--- MENU GERENTE ---");
                System.out.println(MENU_GERENTE);
                int opcao = teclado.nextInt();
                switch (opcao) {
                    case 1:
                        // cadastrar cliente
                        cadastraCliente();

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void operacoesCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void cadastraCliente() {
        Conta conta =  null;
        System.out.println("Informe o NOME do cliente: ");
        String nomeCliente = teclado.next() + teclado.nextLine();
        System.out.println("Informe o CPF do cliente: ");
        String cpfCliente = teclado.next() + teclado.nextLine();
        System.out.println(MENU_TIPO_CONTA);
        int escolha = teclado.nextInt();
        switch (escolha) {
            case 1:
                conta = new ContaCorrente(0, escolha, Operacao.pegaData(), escolha, escolha);
                
                break;
            case 2:
                break;
            case 3:
                break;
        }
                Cliente cliente = new Cliente(nomeCliente, cpfCliente, conta);
    }
}
