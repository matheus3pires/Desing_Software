package br.com.pires.abstractFactory.Atividade.Models;

import br.com.pires.abstractFactory.Atividade.AbstractFactory.SalgadoIngredientesFactory;

public class Coxinha extends Salgado {

    private SalgadoIngredientesFactory ingredientes;

    public Coxinha(String massa, String molho, String recheio) {
        super(massa, molho, recheio);
    }
//
//    public Coxinha(SalgadoIngredientesFactory ingredientes) {
//        super(this.ingredientes.criarMassa(), );
//    }
}
