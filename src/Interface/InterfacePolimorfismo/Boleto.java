package Interface.InterfacePolimorfismo;

public class Boleto implements Pagamento{
    private String numeroBoleto;
    private String dataVencimento;

    public Boleto(String numeroBoleto, String dataVencimento) {
        this.numeroBoleto = numeroBoleto;
        this.dataVencimento = dataVencimento;
    }

    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado via Boleto.");
    }

    public void exibirDetalhesPagamento() {
        System.out.println("Boleto - Número: " + numeroBoleto + ", Vencimento: " + dataVencimento);
    }
}
