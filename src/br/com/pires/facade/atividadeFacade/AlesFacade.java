package br.com.pires.facade.atividadeFacade;

import br.com.pires.facade.atividadeFacade.modelos.ales.Ale;
import br.com.pires.facade.atividadeFacade.modelos.ales.Porter;
import br.com.pires.facade.atividadeFacade.modelos.ales.Stout;
import br.com.pires.facade.atividadeFacade.modelos.ales.Trigo;

import java.util.StringJoiner;

public class AlesFacade {

    private Ale ale;
    private Porter porter;
    private Stout stout;
    private Trigo trigo;

    public AlesFacade() {
        this.ale = new Ale();
        this.porter = new Porter();
        this.stout = new Stout();
        this.trigo = new Trigo();
    }

    public void produzirAle(){
        ale.produzir();
    }

    public void produzirPorter(){
        porter.produzir();
    }

    public void produzirStout(){
        stout.produzir();
    }

    public void produzirTrigo(){
        trigo.produzir();
    }
}
