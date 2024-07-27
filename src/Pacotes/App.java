package Pacotes;

import Pacotes.Videos.Documentario;
import Pacotes.Videos.Filme;
import Pacotes.Videos.Novela;
import Pacotes.Videos.Serie;
import Pacotes.gui.Janela;
import Pacotes.gui.MiniaturaVideo;
import Pacotes.gui.botoes.BotaoPlay;

public class App {
    public static void main(String[] args) {
        Filme filme = new Filme();

        Novela novela = new Novela();

        Documentario documentario = new Documentario();

        Serie serie = new Serie();

        Janela janelinha = new Janela();
        MiniaturaVideo miniaturaVideo = new MiniaturaVideo();

        BotaoPlay botaoPlay = new BotaoPlay();

    }
}
