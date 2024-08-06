package Desafios.Principal;


import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int opcao = -1;

            do {
                try {
                    System.out.println("O que deseja ?" +
                        "\n-------------------------------" +
                        "\n[1] Número Primo" +
                        "\n[2] Palíndromo" +
                        "\n[3] Fatorial" +
                        "\n[4] Sequência de Fibonnaci" +
                        "\n[5] Inverter Array" +
                        "\n[0] Sair" +
                        "\n--------------------------------");
                    System.out.println("Digite a opção: ");
                    opcao = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcao) {
                        case 1:
                            System.out.println("Deseja saber se um número é primo? ");
                            PrimeNumber primeNumber = new PrimeNumber(scanner);
                            primeNumber.solicitarNumero();
                            primeNumber.verificarPrimalidade();
                            primeNumber.resultado();
                            System.out.println();
                            break;
                        case 2:
                            System.out.println("Voce deseja ver se é um Palíndromo");
                            Palindrome palindrome = new Palindrome(scanner);
                            palindrome.solicitarPalavra();
                            palindrome.reverterPalavra();
                            palindrome.exibirDetalhes();
                            System.out.println();
                            break;
                        case 3:
                            System.out.println("Voce deseja ver o Fatorial");
                            Factorial factorial = new Factorial(scanner);
                            factorial.solicitarNumero();
                            factorial.criarFatorial();
                            factorial.exibirDetalhes();
                            break;
                        case 4:
                            System.out.println("Voce deseja ver a Sequência de Fibonacci");
                            Fibonnaci fibonnaci = new Fibonnaci(scanner);
                            fibonnaci.numerosSequencia();
                            fibonnaci.exibirDetalhes();
                            break;
                        case 5:
                            System.out.println("Voce deseja ver uma Sequência de Array Invertido");
                            ReverseArray reverseArray = new ReverseArray(scanner);
                            reverseArray.solicitarArray();
                            reverseArray.arrayOriginal();
                            reverseArray.arrayInvertido();
                            break;
                        default:
                            if (opcao != 0) {
                                System.out.println("Opcao invalida!");
                            } else {
                                System.out.println("Saindo...");
                            }
                            break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Erro: Entrada inválida. Por favor, insira um número inteiro.");
                    scanner.next();
                } catch (Exception e) {
                    System.out.println("Erro inesperado: " + e.getMessage());
                }
            } while (opcao != 0);

            scanner.close();
    }
}
