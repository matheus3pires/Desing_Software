package abstractFactory.Atividade.Models;

import abstractFactory.Atividade.AbstractFactory.SalgadoIngredientesFactory;

public class Empada extends Salgado {

    private SalgadoIngredientesFactory ingredientes;

    public Empada(String massa, String molho, String recheio) {
        super(massa, molho, recheio);
    }
}
