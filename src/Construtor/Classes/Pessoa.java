package Construtor.Classes;

public class Pessoa {
    private String nome;
    private int idade;
    private float altura;
    private float peso;
    private String apelido;
    private boolean estaCadastrado;

    public Pessoa(String nome, int idade, float altura, float peso, String apelido, boolean estaCadastrado) {
        System.out.println("Uma pessoa acaba de nascer! Parabéns");
        System.out.println("Parabéns");
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.apelido = apelido;
        this.estaCadastrado = estaCadastrado;
        imprimirDados();
    }

    public void imprimirDados() {
        System.out.printf("Nome: %s, idade = %d e %.2f \n",
                nome,
                idade,
                altura);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setidade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
