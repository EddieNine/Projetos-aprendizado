package POO;

public class Desenvolvedor implements Funcionario {
    private String nome;
    private String linguagemFavorita;
    private double salarioBase;

    public Desenvolvedor(String nome, String linguagemFavorita, double salarioBase) {
        this.nome = nome;
        this.linguagemFavorita = linguagemFavorita;
        this.salarioBase = salarioBase;
    }

    public void trabalhar() {
        System.out.println("O desenvolvedor " + nome + " está codificando em " + linguagemFavorita);
    }

    public double calcularSalario() {
        return salarioBase + (salarioBase * 0.1); // 10% de bônus
    }

    public void exibirDetalhes() {
        System.out.println("Desenvolvedor - Nome: " + nome + ", Linguagem Favorita: " + linguagemFavorita + ", Salário: R$" + calcularSalario());
    }
}
