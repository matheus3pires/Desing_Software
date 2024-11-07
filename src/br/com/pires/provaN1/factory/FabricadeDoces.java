package br.com.pires.provaN1.factory;

import br.com.pires.provaN1.model.Doce;

public abstract class FabricadeDoces {

    Doce produto;

    public Doce getProduto() {
        return produto;
    }

    public abstract void criarDoce(String tipo, String sabor, String marca,
                            String chocolate, String recheio, String cobertura);
}
