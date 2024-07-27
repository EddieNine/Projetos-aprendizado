package Polimorfismo.Devflix;

public class Serie extends Filme {
    private int temporadas;
    private int episodiosPorTemporadas;
    private int temporadaAtual;
    private int episodioAtual;

    public Serie(String nome, int temporadas, int episodiosPorTemporadas) {
        super(nome);
        this.temporadas = temporadas;
        this.episodiosPorTemporadas = episodiosPorTemporadas;
        this.temporadaAtual = 1;
        this.episodioAtual = 1;
    }

    // Os métodos especificos da classe

    public String toString() {

        String informacao = String.format("Serie %s %dx%d (audio %s, legenda %s)",
                getNome(),
                temporadaAtual,
                episodioAtual);
        //getAudio,
        //getLegenda);
        return informacao;
    }

    // Os métodos getters e setters
    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
}
