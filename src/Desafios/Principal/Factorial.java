package Desafios.Principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {
    private int number;
    private long factorial = 1;
    private Scanner scanner;

    public Factorial(Scanner scanner) {
        this.scanner = scanner;
    }

    public void solicitarNumero() {
        while (true) {
            try {
                System.out.println("\033[0;33mDigite o Número\033[m");
                this.number = scanner.nextInt();
                if (number < 0) {
                    throw new IllegalArgumentException("O número deve ser não-negativo.");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                scanner.next(); // Limpa a entrada inválida
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public void criarFatorial() {
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
    }

    public void exibirDetalhes() {
        System.out.println("O fatorial de " + number + " é " + factorial);
    }
}
