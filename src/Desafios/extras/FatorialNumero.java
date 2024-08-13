package Desafios.extras;

import java.util.Scanner;

public class FatorialNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scanner.nextInt();
        long factorial = 1;
        
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        System.out.println("O fatorial de " + numero + "é " + factorial);
    }
}
