package Games.NumberGuessing;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        // Cria um objeto Random para gerar números aleatórios
        Random random = new Random();
        // Gera um número aleatório entre 1 e 100
        int numeroSecreto = random.nextInt(100) + 1;

        // Cria um Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        int tentativa = 0; // Contador de tentativas
        int palpite = 0; // variável para armazenar o palpite do usuário

        System.out.println("Bem-vindo ao jogo da Adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100");

        // Loop principal do jogo
        while (palpite != numeroSecreto) {
            System.out.println("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativa++;

            // Verificar se o palpite está correto, muito alto ou muito baixo
            if (palpite < numeroSecreto) {
                System.out.println("Muito baixo! Tnte novamente.");
            } else if (palpite > numeroSecreto) {
                System.out.println("Muito alto! Tente novamente.");
            } else {
                System.out.println("Parabéns! Você adivinhou o numero em " + tentativa + " tentativas.");
            }
        }

        // Fecha o scanner
        scanner.close();

    }
}
