package Interface.InterfacePolimorfismo3;

public class Carro implements Veiculo{
    private String marca;
    private String modelo;
    private int numeroPortas;

    public Carro(String marca, String modelo, int numeroPortas) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroPortas = numeroPortas;
    }

    public void acelerar() {
        System.out.println("Carro acelerado");
    }

    public void frear() {
        System.out.println("Carro freado");
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca + "\nModelo: " + modelo +
                "\nNumero de Portas: " + numeroPortas);
    }
}
