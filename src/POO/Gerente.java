package POO;

public class Gerente implements Funcionario {
    private String nome;
    private String departamento;
    private double salarioBase;

    public Gerente(String nome, String departamento, double salarioBase) {
        this.nome = nome;
        this.departamento = departamento;
        this.salarioBase = salarioBase;
    }

    public void trabalhar() {
        System.out.println("O gerente " + nome + " está gerenciando o departamento de "
        + departamento);
    }

    public double calcularSalario() {
        return salarioBase + (salarioBase * 0.2);
    }

    public void exibirDetalhes() {
        System.out.println("Gerente - Nome: " + nome + ", Departamento: " + departamento +
                ", Salario: " + calcularSalario());
    }
}
