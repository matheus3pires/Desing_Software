package br.com.pires.facade.exemplo;

import br.com.pires.facade.exemplo.modelos.Amplificador;
import br.com.pires.facade.exemplo.modelos.Bluray;
import br.com.pires.facade.exemplo.modelos.Projetor;

public class HomeTheater {

    public static void main(String[] args) {
        Amplificador jbl = new Amplificador();
        Bluray sony = new Bluray();
        Projetor sansumg = new Projetor();

        HomeTheaterFacade controle = new HomeTheaterFacade(jbl,sony, sansumg);

        controle.assistir("Como treinar seu Dragão.");
        controle.desligar();

    }
}
