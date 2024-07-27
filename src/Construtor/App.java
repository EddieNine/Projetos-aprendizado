package Construtor;

import Construtor.Classes.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa("Joao II", 7, 1.50f, 88, "joaozin", true);

        pessoa.imprimirDados();


    }
}
