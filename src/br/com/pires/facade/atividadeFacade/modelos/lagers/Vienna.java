package br.com.pires.facade.atividadeFacade.modelos.lagers;

import br.com.pires.facade.atividadeFacade.modelos.Cerveja;

public class Vienna implements Cerveja {
    @Override
    public void produzir() {
        System.out.println("Cerveja Vienna");
    }
}