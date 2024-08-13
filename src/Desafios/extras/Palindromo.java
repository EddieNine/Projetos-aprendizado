package Desafios.extras;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a palavra:");
        String word = scanner.nextLine();

        // Remove espaços em branco e converte para minúsculas
        String normalizedWord = word.replaceAll("\\s+", "").toLowerCase();

        // Inverte a palavra
        String reversedWord = new StringBuilder(normalizedWord).reverse().toString();

        // Verifica se é palíndromo
        if (normalizedWord.equals(reversedWord)) {
            System.out.println(word + " é um palíndromo");
        } else {
            System.out.println(word + " não é um palíndromo");
        }
    }
}
