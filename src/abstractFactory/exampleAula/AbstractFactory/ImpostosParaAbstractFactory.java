package abstractFactory.exampleAula.AbstractFactory;

import abstractFactory.exampleAula.Models.Impostos.ICMS;
import abstractFactory.exampleAula.Models.Impostos.IcmsGoias;
import abstractFactory.exampleAula.Models.Impostos.IcmsPara;

public class ImpostosParaAbstractFactory implements ImpostoAbstractFactory{

    @Override
    public ICMS getICMS() {
        return new IcmsPara();
    }
}
