package ClassesObjetos;

public class App {
    public static void main(String[] args) {
        Celular celularA = new Celular();
        celularA.nome = "Iphone 12";
        celularA.tamanhoTela = 6.1f;
        celularA.espacoArmazenamento = 256;
        celularA.sistemaOperacional = "IOS";

        Celular celularB = new Celular();
        celularB.nome = "Galaxy Note 20 ultra";
        celularB.tamanhoTela = 6.9f;
        celularB.espacoArmazenamento = 256;
        celularB.sistemaOperacional = "Android";

        System.out.printf("Celular %s com tela de %.1f, com %dgb e SO %s", celularA.nome
                , celularA.tamanhoTela, celularA.espacoArmazenamento, celularA.sistemaOperacional);
    }
}
