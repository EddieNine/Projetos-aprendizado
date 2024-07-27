package Polimorfismo.Devflix;

public class Filme extends Video {
    private String audio;
    private String legenda;


    public Filme(String nome) {
        super(nome);
        this.audio = "português";
        this.legenda = "nenhuma";
    }

    @Override
    public void play() {
        System.out.println("Play: filme " + getNome());
        super.play();
    }

    public void play(String audio) {
        this.audio = audio;
        if (audio == "português") {
            this.legenda = "nenhuma";
        } else {
            this.legenda = "português";
        }
        System.out.println("Play: " + toString());
    }

    public void play(String audio, String legenda) {
        this.audio = audio;
        this.legenda = legenda;
        System.out.println("Play: " + toString());
    }

    public String toString() {
        String informacao = String.format("Filme %s (audio %s, legenda %s)", getNome(), audio, legenda);
        return informacao;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }
}
