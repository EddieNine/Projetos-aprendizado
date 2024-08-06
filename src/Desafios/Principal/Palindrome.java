package Desafios.Principal;

import java.util.Scanner;

public class Palindrome {
    private String word;
    private String reversedWordCleaned;
    private String wordCleaned;
    private Scanner scanner;

    public Palindrome(Scanner scanner) {
        this.scanner = scanner;
    }

    public void solicitarPalavra() {
        System.out.println("\033[0;33mDigite a palavra\033[m");
        this.word = scanner.nextLine();
    }

    public void reverterPalavra() {
        this.wordCleaned = word.replaceAll("[\\W]", "").toLowerCase();
        this.reversedWordCleaned = new StringBuilder(wordCleaned).reverse().toString();
    }

    public void exibirDetalhes() {
        if (wordCleaned.equals(reversedWordCleaned)) {
            System.out.println("A palavra \"" + word + "\" é um palíndromo");
        } else {
            System.out.println("A palavra \"" + word + "\" não é um palíndromo");
        }
    }
}
