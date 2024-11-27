package br.com.pires.facade.atividadeFacade;

import br.com.pires.facade.atividadeFacade.modelos.lagers.Lager;
import br.com.pires.facade.atividadeFacade.modelos.lagers.Munich;
import br.com.pires.facade.atividadeFacade.modelos.lagers.Vienna;

public class LagersFacade {

    private Lager lager;
    private Munich munich;
    private Vienna vienna;

    public LagersFacade() {
        this.lager = new Lager();
        this.munich = new Munich();
        this.vienna = new Vienna();
    }

    public void produzirLager(){
        lager.produzir();
    }

    public void produzirMunich(){
        munich.produzir();
    }

    public void produzirVienna(){
        vienna.produzir();
    }
}
