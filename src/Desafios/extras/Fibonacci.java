package Desafios.extras;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de termos da sequência de Fibonacci que deseja ver:");
        int n = scanner.nextInt();

        // Primeiros dois termos da sequência de Fibonacci
        int primeiroTermo = 0, segundoTermo = 1;

        System.out.print("Sequência de Fibonacci até " + n + " termos: ");

        for (int i = 1; i <= n; ++i) {
            System.out.print(primeiroTermo + " ");

            // Calcula o próximo termo
            int proximoTermo = primeiroTermo + segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }
    }
}
