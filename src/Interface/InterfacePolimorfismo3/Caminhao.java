package Interface.InterfacePolimorfismo3;

public class Caminhao implements Veiculo{
    private String marca;
    private String modelo;
    private double capacidadeCarga;

    public Caminhao(String marca, String modelo, double capacidadeCarga) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeCarga = capacidadeCarga;
    }

    public void acelerar() {
        System.out.println("Acelerando caminhao");
    }

    public void frear() {
        System.out.println("Freando caminhao");
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca + "\nModelo: " + modelo +
                "\nCapacidade Carga: " + capacidadeCarga);

    }
}
