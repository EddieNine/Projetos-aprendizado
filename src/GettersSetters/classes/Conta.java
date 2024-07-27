package GettersSetters.classes;

public class Conta {
    private double saldo;

    public void despositar(double valor) {
        if (valor < 0) {
            System.out.println("Não pdoe despositar numero negativo");
        } else {
            saldo = saldo + valor;
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
