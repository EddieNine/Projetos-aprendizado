package Interface.InterfacePolimorfismo;

public class PayPal implements Pagamento{
    private String email;
    private String senha;

    public PayPal(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado via PayPal.");
    }

    public void exibirDetalhesPagamento() {
        System.out.println("PayPal - Email: " + email);
    }
}
