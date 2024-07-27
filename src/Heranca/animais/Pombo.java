package Heranca.animais;

public class Pombo extends Ave {
    private int cartasEnviadas;

    public Pombo(String nome) {
        super(nome);
        cartasEnviadas = 10;
    }

    public void fazerPru() {
        System.out.printf("%s fez Pruuuu\n", getNome());
    }

    public void enviarCarta() {
        System.out.printf("%s enviou uma carta\n", getNome());
        this.cartasEnviadas = cartasEnviadas + 1;
    }

    public int getCartasEnviadas() {
        return cartasEnviadas;
    }
}
