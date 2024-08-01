package Desafios.NumeroPrimo;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        // Criação de um Scanner para Entrada do Usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitação de um Número ao Usuário
        System.out.println("Digite um número para ver se é primo: ");
        int number = scanner.nextInt();

        // Inicialização da Variável isPrime
        boolean isPrime = true;

        // Loop para Verificação da Primalidade
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

        // Verificação e Impressão do Resultado
        if(isPrime) {
            System.out.println(number + " È um número primo.");
        } else{
            System.out.println(number + " Não é um número primo.");
        }

        scanner.close();
    }
}
