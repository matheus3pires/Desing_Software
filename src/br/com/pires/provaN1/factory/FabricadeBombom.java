package br.com.pires.provaN1.factory;

import br.com.pires.provaN1.model.Bombom;

public class FabricadeBombom extends FabricadeDoces{

    @Override
    public void criarDoce(String tipo, String sabor, String marca,
                   String chocolate, String recheio, String cobertura) {
        this.produto = new Bombom(tipo, chocolate, recheio, cobertura);
    }
}
