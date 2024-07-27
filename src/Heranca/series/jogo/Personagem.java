package Heranca.series.jogo;

public class Personagem {
    private String nome;
    private String classe;
    private int nivel;

    public Personagem(String nome) {
        this.nome = nome;
        this.classe = "";
        this.nivel = 1;
    }

    public String toString() {
        String informacoes = String.format("%s (nivel: %d) - Classe: %s", nome, nivel, classe);
        return informacoes;
    }

    public final void atacarSemArma() {
        System.out.println("O personagem atacou");
    }

    public void atacar() {
        System.out.println("O personagem atacou");
    }

    public void atacarComArma() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
