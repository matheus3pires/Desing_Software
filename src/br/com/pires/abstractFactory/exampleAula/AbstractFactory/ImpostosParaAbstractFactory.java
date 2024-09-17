package br.com.pires.abstractFactory.exampleAula.AbstractFactory;

import br.com.pires.abstractFactory.exampleAula.Models.Impostos.ICMS;
import br.com.pires.abstractFactory.exampleAula.Models.Impostos.IcmsPara;

public class ImpostosParaAbstractFactory implements ImpostoAbstractFactory{

    @Override
    public ICMS getICMS() {
        return new IcmsPara();
    }
}
