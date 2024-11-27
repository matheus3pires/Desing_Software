package br.com.pires.facade.exemplo;

import br.com.pires.facade.exemplo.modelos.Amplificador;
import br.com.pires.facade.exemplo.modelos.Bluray;
import br.com.pires.facade.exemplo.modelos.Projetor;

public class HomeTheaterFacade {

    private Amplificador amplificador;
    private Bluray bluray;
    private Projetor projetor;

    public HomeTheaterFacade(Amplificador amplificador, Bluray bluray, Projetor projetor) {
        this.amplificador = amplificador;
        this.bluray = bluray;
        this.projetor = projetor;
    }

    public void assistir(String filme){
        amplificador.on();
        amplificador.setVolume(15);

        projetor.on();
        projetor.setModo();

        bluray.on();
        bluray.play(filme);
    }

    public void desligar(){
        amplificador.on();
        projetor.off();
        bluray.stop();
        bluray.off();
    }
}
