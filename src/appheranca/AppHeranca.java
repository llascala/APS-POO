package appheranca;

import java.util.Scanner;

public class AppHeranca {

    public static void main(String[] args) {
        
        GerenciarFuncionarios g = new GerenciarFuncionarios();
        
        
        Scanner entrada = new Scanner(System.in);
        int opcao;
        Funcionario f;
        Gerente ger;
        String resultado;
        
        do {
            
            System.out.println("Digite:");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Listar nome e salário");
            System.out.println("4 - Contar gerentes");
            System.out.println("5 - Listar por faixa");
            System.out.println("6 - Remover");
            System.out.println("7 - Sair");
            
            opcao = entrada.nextInt();
            entrada.nextLine();
            
            switch(opcao) {
                case 1:
                    System.out.println("Deseja criar (1) funcionario ou (2) gerente?");
                    int opcaoCriacao = entrada.nextInt();
                    entrada.nextLine();
                    if(opcaoCriacao == 1) {
                        f = new Funcionario();
                        System.out.println("Digite nome");
                        f.setNome(entrada.nextLine());
                        System.out.println("Digite salario");
                        f.setSalario(entrada.nextDouble());
                        g.add(f);
                    }
                    else if (opcaoCriacao == 2) {
                        ger = new Gerente();
                        System.out.println("digite nome");
                        ger.setNome(entrada.nextLine());
                        System.out.println("digite salario");
                        ger.setSalario(entrada.nextDouble());
                        System.out.println("digite numero funcionarios");
                        ger.setnFuncionarios(entrada.nextInt());
                        g.add(ger);
                    }
                    else {
                        System.out.println("Errou");
                    }
                    break;
                case 2:
                    System.out.println("Dados do programa:");
                    System.out.println(g.listar());
                    break;
                case 3:
                    System.out.println("Lista de nomes e salários");
                    System.out.println(g.listarSalario());
                    break;
                case 4:
                    System.out.println("Número de gerentes: " +
                            g.contarGerentes());
                    break;
                case 5:
                    System.out.println("Digite menor valor");
                    double valorInicial = entrada.nextDouble();
                    System.out.println("Digite maior valor");
                    double valorFinal = entrada.nextDouble();
                    resultado = g.listarPorFaixaSalarial(valorInicial,
                            valorFinal);
                    System.out.println("Resultado:");
                    System.out.println(resultado);
                    break;
                case 6:
                    System.out.println("digite nome remoção");
                    boolean retorno = g.removerFuncionario(entrada.nextLine());
                    System.out.println(retorno);
                    break;
                case 7:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
            
        } while (opcao != 7);
    }
    
}