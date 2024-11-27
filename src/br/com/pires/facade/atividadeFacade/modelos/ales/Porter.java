package br.com.pires.facade.atividadeFacade.modelos.ales;

import br.com.pires.facade.atividadeFacade.modelos.Cerveja;

public class Porter implements Cerveja {
    @Override
    public void produzir() {
        System.out.println("Cerveja Porter");
    }
}
