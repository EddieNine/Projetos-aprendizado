package Desafios.extras;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira palavra:");
        String palavra1 = scanner.nextLine();

        System.out.println("Digite a segunda palavra:");
        String palavra2 = scanner.nextLine();

        // Normaliza as palavras (remove espaços e converte para minúsculas)
        String palavra1Normalizada = palavra1.replaceAll("\\s+", "").toLowerCase();
        String palavra2Normalizada = palavra2.replaceAll("\\s+", "").toLowerCase();

        // Converte as palavras em arrays de caracteres
        char[] palavra1Array = palavra1Normalizada.toCharArray();
        char[] palavra2Array = palavra2Normalizada.toCharArray();

        // Ordena os arrays de caracteres
        Arrays.sort(palavra1Array);
        Arrays.sort(palavra2Array);

        // Verifica se as palavras são anagramas
        if (Arrays.equals(palavra1Array, palavra2Array)) {
            System.out.println(palavra1 + " e " + palavra2 + " são anagramas.");
        } else {
            System.out.println(palavra1 + " e " + palavra2 + " não são anagramas.");
        }
    }
}
