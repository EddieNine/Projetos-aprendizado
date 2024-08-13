package Desafios.extras;

import java.util.Scanner;

public class SomaDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scanner.nextInt();
        int soma = 0;

        // Soma os dígitos do número
        while (numero != 0) {
            soma += numero % 10;  // Pega o último dígito do número
            numero /= 10;  // Remove o último dígito do número
        }

        System.out.println("A soma dos dígitos é: " + soma);
    }
}
