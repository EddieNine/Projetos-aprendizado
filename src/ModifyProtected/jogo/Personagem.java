package ModifyProtected.jogo;

import java.util.Random;

public abstract class Personagem {
    public abstract void atacar();

    public int rolarDado() {
        Random gerador = new Random();
        int numero = 1 + gerador.nextInt(6);
        return numero;
    }
}
