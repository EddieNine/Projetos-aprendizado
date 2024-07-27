package Interface.InterfacePolimorfismo3;

public class Moto implements Veiculo{
    private String marca;
    private String modelo;
    private double cilindradas;

    public Moto(String marca, String modelo, double cilindradas) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindradas = cilindradas;
    }

    public void acelerar() {
        System.out.println("Moto acelerado");
    }

    public void frear() {
        System.out.println("Moto freado");
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca + "\nModelo: " + modelo +
                "\nCilindradas: " + cilindradas);
    }
}
