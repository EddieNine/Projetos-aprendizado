package Heranca.series;

import Heranca.series.jogo.Arqueiro;
import Heranca.series.jogo.Personagem;

public class App {
    public static void main(String[] args) {
        Personagem personagem = new Personagem("João");
        System.out.println(personagem);
        personagem.atacar();

        Arqueiro arqueiro = new Arqueiro("Legolas");
        System.out.println(arqueiro);

        arqueiro.atacar();
        arqueiro.atacarSemArma();
    }
}
