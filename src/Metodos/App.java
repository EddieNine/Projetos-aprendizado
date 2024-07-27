package Metodos;

public class App {
    public static void main(String[] args) throws Exception {
        Personagem heroi = new Personagem();
        heroi.nome = "Hércules";
        heroi.nivel = 2;
        heroi.forca = 16;

        heroi.mostrarStatus();
        heroi.atacar("Hydra", "Golpe Duplo");
        
    }
}
