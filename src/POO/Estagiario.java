package POO;

public class Estagiario implements Funcionario{
    private String nome;
    private String curso;
    private double salarioBase;

    public Estagiario(String nome, String curso, double salarioBase) {
        this.nome = nome;
        this.curso = curso;
        this.salarioBase = salarioBase;
    }

    public void trabalhar() {
        System.out.println("O estagiário " + nome + " está estudando " + curso);
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public void exibirDetalhes() {
        System.out.println("Estagiário - Nome: " + nome + ", Curso: " + curso + ", Salário: R$" + calcularSalario());
    }
}
