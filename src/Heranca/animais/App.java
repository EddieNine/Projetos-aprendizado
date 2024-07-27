package Heranca.animais;

public class App {
    public static void main(String[] args) throws Exception {
        Cachorro cachorro = new Cachorro("Caramelho");
        cachorro.setNome("Caramelo");
        cachorro.latir();
        cachorro.comer();

        Gato gato = new Gato("Snowbell");
        gato.setNome("Snowbell");
        gato.miar();

        Dragao dragao = new Dragao("Dragão branco de olhos azuis");
        dragao.voar();
        dragao.soltarFogo();

        Pombo pombinha = new Pombo("Pombo correio Sedex");
        pombinha.voar();
        pombinha.enviarCarta();
        pombinha.fazerPru();
    }
}
