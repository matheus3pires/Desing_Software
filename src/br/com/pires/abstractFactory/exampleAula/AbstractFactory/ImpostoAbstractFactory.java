package br.com.pires.abstractFactory.exampleAula.AbstractFactory;

import br.com.pires.abstractFactory.exampleAula.Models.Impostos.ICMS;

public interface ImpostoAbstractFactory {

    public abstract ICMS getICMS();

}
