package Interface.InterfacePolimorfismo;

public class CartaoCredito implements Pagamento{
    private String numeroCartao;
    private String nomeTitular;

    public CartaoCredito(String numeroCartao, String nomeTitular) {
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
    }

    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com cartão de crédito.");
    }

    public void exibirDetalhesPagamento() {
        System.out.println("Cartão de Crédito - Número: " + numeroCartao + ", Titular: " + nomeTitular);
    }
}
