package Static;

public class Main {
    public static void main(String[] args) {
        Carro ferrari = new Carro("Ferrari", 2023);

        Carro fusca = new Carro("Fusca", 1999);
        fusca.setNome("Fusca Branco");

        ferrari.anoCompra = 2007;

        System.out.println(ferrari.getNome());
        System.out.println(fusca.getNome());
        System.out.println(ferrari.anoCompra);
    }
}
