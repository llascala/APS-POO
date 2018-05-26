package banco;

import java.util.Scanner;

public class banco {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcao;
        ContaCorrente c;
        ContaEspecial e;
        ContaPoupanca p;
        GerenciarContas g = new GerenciarContas();
        String resultado;
        int numeroConta;
        double valorSacado, valorDepositado;
        do {

            System.out.println("Digite:");
            System.out.println("1 - Cadastrar Conta");
            System.out.println("2 - Listar");
            System.out.println("3 - Buscar conta");
            System.out.println("4 - Buscar clientes usando o limite");
            System.out.println("5 - Buscar contas especiais");
            System.out.println("6 - Sacar valor");
            System.out.println("7 - Depositar valor");
            System.out.println("8 - transferir valor");
            System.out.println("9 - Remover Conta");
            System.out.println("10 - Sair");

            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Deseja criar (1) Conta Corrente, (2) Conta Poupança ou (3) Conta Especial ?");
                    int opcaoCriacao = entrada.nextInt();
                    entrada.nextLine();
                    if (opcaoCriacao == 1) {
                        c = new ContaCorrente();
                        System.out.println("Digite nome");
                        c.setNomeCliente(entrada.nextLine());
                        System.out.println("Digite CPF");
                        c.setCPF(entrada.nextInt());
                        System.out.println("Digite numero da Conta");
                        c.setNumeroConta(entrada.nextInt());
                        System.out.println("Digite salario");
                        c.setLimite(entrada.nextDouble());
                        g.add(c);
                    } else if (opcaoCriacao == 2) {
                        p = new ContaPoupanca();
                        System.out.println("Digite nome");
                        p.setNomeCliente(entrada.nextLine());
                        System.out.println("Digite CPF");
                        p.setCPF(entrada.nextInt());
                        System.out.println("Digite numero da Conta");
                        p.setNumeroConta(entrada.nextInt());
                        System.out.println("digite seu Saldo");
                        p.setSaldo(entrada.nextDouble());
                        g.add(p);
                    } else if (opcaoCriacao == 3) {
                        e = new ContaEspecial();
                        System.out.println("Digite nome");
                        e.setNomeCliente(entrada.nextLine());
                        System.out.println("Digite CPF");
                        e.setCPF(entrada.nextInt());
                        System.out.println("Digite numero da Conta");
                        e.setNumeroConta(entrada.nextInt());
                        entrada.nextLine();
                        System.out.println("Digite nome do gerente");
                        e.setNomeGerente(entrada.nextLine());
                        g.add(e);
                    } else {
                        System.out.println("Errou");
                    }
                    break;
                case 2:
                    System.out.println("Dados das Contas:");
                    System.out.println(g.listarConta());
                    break;
                case 3:
                    System.out.println("Buscar conta:");
                    System.out.println(g.buscarConta(123456789));
                    break;
                case 4:
                    System.out.println("Buscar clientes usando o limite:");
                    System.out.println(g.buscarClientesUsandoLimite());
                    break;
                case 5:
                    System.out.println("Buscar contas especiais:");
                    System.out.println(g.buscarContasEspeciais("Lucas"));
                    break;
                case 6:
                    System.out.println("Insira o numero da conta:");
                    numeroConta = entrada.nextInt();
                    System.out.println("Insira o valor a ser sacado:");
                    valorSacado = entrada.nextDouble();
                    g.sacar(numeroConta, valorSacado);
                    break;
                case 7:
                    System.out.println("Insira o numero da conta:");
                    numeroConta = entrada.nextInt();
                    System.out.println("Insira o valor a ser depositado:");
                    valorDepositado = entrada.nextDouble();
                    g.depositar(numeroConta, valorDepositado);
                    break;
                case 8:
                    System.out.println("transferir valor:");
                    break;
                case 9:
                    System.out.println("digite Numero da conta em remoção");
                    boolean retorno = g.removerConta(entrada.nextInt());
                    System.out.println(retorno);
                    break;
                case 10:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 10);

    }

}
