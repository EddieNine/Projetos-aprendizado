package Agregacao;

public class App {
    public static void main(String[] args) {
        Telefone telefone = new Telefone("4002 8322");
        Contato contatoA = new Contato("Lucas", "40897256");
        Contato contatoB = new Contato("Luan", "40897496");
        Contato contatoC = new Contato("Maria", "40897056");

        telefone.getContatos().adicionar(contatoA);
        telefone.getContatos().adicionar(contatoB);
        telefone.getContatos().adicionar(contatoC);
        System.out.println(telefone.getContatos());

    }
}
