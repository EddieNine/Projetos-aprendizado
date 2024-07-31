package Games.AdivinharPalavra;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JogoDeAdivinhacao jogo = new JogoDeAdivinhacao();
        jogo.iniciarJogo();

        System.out.println("Bem-vindo ao Jogo de Adivinhação de Palavras!");
        while(true) {
            jogo.mostrarProgresso();
            System.out.println("Digite uma letra: ");
            char letra = scanner.nextLine().toUpperCase().charAt(0);

            if(jogo.adivinharLetra(letra)) {
                System.out.println("Você acertou uma letra!");
            } else {
                System.out.println("Você errou.");
            }

            if (jogo.vencerJogo()) {
                System.out.println("Parabéns! Você adivinhou a palavra: " + jogo.palavraSecreta);
                System.out.println("Número de tentativas: " + jogo.tentativas);
                break;
            }

            if(jogo.perderJogo()) {
                System.out.println("Você perdeu! A palavra era: " + jogo.palavraSecreta);
                break;
            }
        }

        scanner.close();
    }
}
