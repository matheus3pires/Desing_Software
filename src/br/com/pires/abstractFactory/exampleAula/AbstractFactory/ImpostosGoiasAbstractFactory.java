package br.com.pires.abstractFactory.exampleAula.AbstractFactory;

import br.com.pires.abstractFactory.exampleAula.Models.Impostos.ICMS;
import br.com.pires.abstractFactory.exampleAula.Models.Impostos.IcmsGoias;

public class ImpostosGoiasAbstractFactory implements ImpostoAbstractFactory{

    @Override
    public ICMS getICMS() {
        return new IcmsGoias();
    }
}
