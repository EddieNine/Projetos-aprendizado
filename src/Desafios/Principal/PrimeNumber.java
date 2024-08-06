package Desafios.Principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeNumber {
    private boolean isPrime = true;
    private int number;
    private final Scanner scanner;

    public PrimeNumber(Scanner scanner) {
        this.scanner = scanner;
    }

    public void solicitarNumero() {
        while (true) {
            try {
                System.out.println("\033[0;33mDigite o Número\033[m ");
                this.number = scanner.nextInt();
                if(number < 0) {
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

    public void verificarPrimalidade() {
        if (number < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if(number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
    }

    public void resultado() {
        if (isPrime) {
            System.out.println("O valor " + number + " \033[0;32mÉ um Número primo\033[m");
        } else {
            System.out.println("o valor " + number + " \033[0;31mNão é um Número primo\033[m");
        }
    }
}
