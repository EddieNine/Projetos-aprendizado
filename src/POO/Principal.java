package POO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Adicionar funcionário:");
            System.out.println("1. Gerente");
            System.out.println("2. Desenvolvedor");
            System.out.println("3. Estagiário");
            System.out.println("4. Sair");
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            if (escolha == 4) {
                break;
            }

            switch (escolha) {
                case 1:
                    System.out.print("Digite o nome do gerente: ");
                    String nomeGerente = scanner.nextLine();
                    System.out.print("Digite o departamento do gerente: ");
                    String departamento = scanner.nextLine();
                    System.out.print("Digite o salário base do gerente: ");
                    double salarioGerente = scanner.nextDouble();
                    funcionarios.add(new Gerente(nomeGerente, departamento, salarioGerente));
                    break;
                case 2:
                    System.out.print("Digite o nome do desenvolvedor: ");
                    String nomeDesenvolvedor = scanner.nextLine();
                    System.out.print("Digite a linguagem favorita do desenvolvedor: ");
                    String linguagem = scanner.nextLine();
                    System.out.print("Digite o salário base do desenvolvedor: ");
                    double salarioDesenvolvedor = scanner.nextDouble();
                    funcionarios.add(new Desenvolvedor(nomeDesenvolvedor, linguagem, salarioDesenvolvedor));
                    break;
                case 3:
                    System.out.print("Digite o nome do estagiário: ");
                    String nomeEstagiario = scanner.nextLine();
                    System.out.print("Digite o curso do estagiário: ");
                    String curso = scanner.nextLine();
                    System.out.print("Digite o salário base do estagiário: ");
                    double salarioEstagiario = scanner.nextDouble();
                    funcionarios.add(new Estagiario(nomeEstagiario, curso, salarioEstagiario));
                    break;
                default:
                    System.out.println("Escolha inválida.");
                    break;
            }
        }

        System.out.println("\nLista de Funcionários:");
        for (Funcionario funcionario : funcionarios) {
            funcionario.trabalhar();
            funcionario.exibirDetalhes();
        }

        scanner.close();
    }
}
