package abstractFactory.exampleAula.AbstractFactory;

import abstractFactory.exampleAula.Models.Impostos.ICMS;
import abstractFactory.exampleAula.Models.Impostos.IcmsGoias;

public class ImpostosGoiasAbstractFactory implements ImpostoAbstractFactory{

    @Override
    public ICMS getICMS() {
        return new IcmsGoias();
    }
}
