package Interface.InterfacePolimorfismo2;

public class Comissionado implements Funcionario{
    private String nome;
    private int vendas;
    private double taxaComissao;

    public Comissionado(String nome, int vendas, double taxaComissao) {
        this.nome = nome;
        this.vendas = vendas;
        this.taxaComissao = taxaComissao;
    }

    public double calcularSalario() {
        return vendas * taxaComissao;
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + nome + "\nVendas: " + vendas + "\nTaxa de Comissao: " + taxaComissao);
        System.out.println("Salario: " + calcularSalario());
    }
}
