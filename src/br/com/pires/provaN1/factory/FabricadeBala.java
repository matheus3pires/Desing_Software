package br.com.pires.provaN1.factory;

import br.com.pires.provaN1.model.Bala;

public class FabricadeBala extends FabricadeDoces {

    @Override
    public void criarDoce(String tipo, String sabor, String marca,
                   String chocolate, String recheio, String cobertura) {
        this.produto = new Bala(tipo, sabor, marca);
    }
}
