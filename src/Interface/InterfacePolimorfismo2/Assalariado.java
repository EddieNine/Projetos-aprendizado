package Interface.InterfacePolimorfismo2;

public class Assalariado implements Funcionario{
    private String nome;
    private double salarioMensal;

    public Assalariado(String nome, double salarioMensal) {
        this.nome = nome;
        this.salarioMensal = salarioMensal;
    }

    public double calcularSalario() {
        return salarioMensal;
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + nome + "\nSalario: " + salarioMensal);
    }

}
