package Heranca.series.jogo;

public class Arqueiro extends Personagem {
    private String arma;

    public Arqueiro(String nome) {
        super(nome);
        setClasse("Arqueiro");
        setNivel(2);
        this.arma = "Arco Longo";
    }

    @Override
    public String toString() {
        String informacaoPersonagem = super.toString();
        String informacaoArqueiro = String.format(" - Arma: %s", arma);
        String resultado = informacaoPersonagem + informacaoArqueiro;
        return resultado;
    }

    public void atacar() {
        System.out.println("O Arqueiro atacou com " + arma);
    }
}
