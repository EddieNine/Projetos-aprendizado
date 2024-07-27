package Polimorfismo;

import Polimorfismo.Devflix.Filme;

public class App {
    public static void main(String[] args) {
        Filme filme = new Filme("Lagoa azul");
        filme.play("japonês");
        filme.play();
        filme.play("inglês", "arabe");
        
    }
}
