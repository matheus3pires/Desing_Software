package abstractFactory.exampleAula.AbstractFactory;

import abstractFactory.exampleAula.Models.Impostos.ICMS;

public interface ImpostoAbstractFactory {

    public abstract ICMS getICMS();

}
