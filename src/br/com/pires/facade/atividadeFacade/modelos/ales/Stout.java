package br.com.pires.facade.atividadeFacade.modelos.ales;

import br.com.pires.facade.atividadeFacade.modelos.Cerveja;

public class Stout implements Cerveja {
    @Override
    public void produzir() {
        System.out.println("Cerveja Stout");
    }
}
