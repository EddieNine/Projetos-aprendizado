package Desafios.Principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fibonnaci {
    private int n;
    private int num1;
    private int num2 = 1;
    private Scanner scanner;

    public Fibonnaci(Scanner scanner) {
        this.scanner = scanner;
    }

    public void numerosSequencia() {
        while (true) {
            try {
                System.out.println("\033[0;33mDigite a Quantidade que você quer ver: \033[m");
                this.n = scanner.nextInt();
                if(n < 0) {
                    throw new IllegalArgumentException("A quantidade deve ser não-negativa.");
                }
                break;
            } catch (InputMismatchException e ){
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                scanner.next(); // Limpa a entrada inválida
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public void exibirDetalhes() {
        System.out.println("Os primeiros " + n + " números da sequência de Fibonacci são: ");
        for (int i = 1; i <= n; i++) {
            System.out.println(num1 + " ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
        System.out.println();
    }
}
