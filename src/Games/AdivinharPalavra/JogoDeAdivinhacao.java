package Games.AdivinharPalavra;

import java.util.Random;

public class JogoDeAdivinhacao {
    private String[] palavras = {"JAVA", "PROGRAMACAO", "COMPUTADOR", "DESENVOLVIMENTO", "SOFTWARE"};
    String palavraSecreta;
    private char[] palavraAtual;
    int tentativas;
    private int tentativasErradas;
    private final int maxTentativas = 6;

    public void iniciarJogo() {
        Random random = new Random();
        palavraSecreta = palavras[random.nextInt(palavras.length)];
        palavraAtual = new char[palavraSecreta.length()];
        for(int i = 0; i < palavraAtual.length; i++) {
            palavraAtual[i] = '_';
        }
        tentativas = 0;
        tentativasErradas = 0;
    }

    public boolean adivinharLetra(char letra) {
        boolean acerto = false;
        for (int i = 0; i < palavraSecreta.length(); i++) {
            if (palavraSecreta.charAt(i) == letra) {
                palavraAtual[i] = letra;
                acerto = true;
            }
        }
        tentativas++;
        if (!acerto) {
            tentativasErradas++;
        }
        return acerto;
    }

    public void mostrarProgresso(){
        System.out.println("Palavra: " + String.valueOf(palavraAtual));
        System.out.println("Tentativas: " + tentativas);
        System.out.println("Tentativas Erradas: " + tentativasErradas);
    }

    public boolean vencerJogo() {
        return String.valueOf(palavraAtual).equals(palavraSecreta);
    }

    public boolean perderJogo() {
        return tentativasErradas >= maxTentativas;
    }

    public boolean palavraCompleta() {
        for (char c : palavraAtual) {
            if(c == '_') {
                return false;
            }
        }
        return true;
    }
}
