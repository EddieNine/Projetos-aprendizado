package Desafios.Palindromo;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        // Criação de um Scanner para Entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitação de uma Palavra ao Usuário
        System.out.println("Digite uma palvra: ");
        String word = scanner.nextLine();

        // Ignorar Diferenças de Caixa (Maiúsculas e Minúsculas)
        // Ignorar Espaços e Pontuações:
        String wordCleaned = word.replaceAll("[\\W]", "").toLowerCase();

        // Reversão da Palavra
        String reversedWordCleaned = new StringBuilder(wordCleaned).reverse().toString();

        // Veirificação se a Palavra é um Palíndromo
        if (wordCleaned.equals(reversedWordCleaned)) {
            System.out.println(word + " e um palindromo.");
        } else {
            System.out.println(word + " nao e um palindromo");
        }
    }
}
