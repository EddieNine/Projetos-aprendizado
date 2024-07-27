package GettersSetters;

import GettersSetters.classes.Conta;
import GettersSetters.classes.Pessoa;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Bob Esponja");
        pessoa.setAltura(1.9);
        pessoa.setIdade(20);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getAltura());
        System.out.println(pessoa.getIdade());

        Conta conta = new Conta();
        System.out.println(conta.getSaldo());
        conta.despositar(200);
        System.out.println(conta.getSaldo());
    }
}
