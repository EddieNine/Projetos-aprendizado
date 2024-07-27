package Interface.InterfacePolimorfismo2;

public class Horista implements Funcionario{
    private String nome;
    private int horasTrabalhadas;
    private double salarioPorHora;

    public Horista(String nome, int horasTrabalhadas, double salarioPorHora) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.salarioPorHora = salarioPorHora;
    }

    public double calcularSalario() {
        return horasTrabalhadas*salarioPorHora;
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + nome + "\nHoras Trabalhadas: " + horasTrabalhadas + "\nSalario Por Hora: " + salarioPorHora);
        System.out.println("Salario: " + calcularSalario());
    }
}
