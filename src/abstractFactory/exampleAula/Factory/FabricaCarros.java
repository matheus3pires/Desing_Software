package abstractFactory.exampleAula.Factory;

import abstractFactory.exampleAula.AbstractFactory.ImpostoAbstractFactory;
import abstractFactory.exampleAula.AbstractFactory.ImpostosGoiasAbstractFactory;
import abstractFactory.exampleAula.AbstractFactory.ImpostosParaAbstractFactory;
import abstractFactory.exampleAula.Models.Carros.Captiva;
import abstractFactory.exampleAula.Models.Carros.Carro;
import abstractFactory.exampleAula.Models.Carros.Onix;
import abstractFactory.exampleAula.Models.Carros.Palio;

public class FabricaCarros {
    public enum CarrosEnum{CAPTIVA, ONIX, PALIO};
    ImpostoAbstractFactory imposto;

    public FabricaCarros() {
    }

    public Carro getCarro(String tipoCarro, String Estado){
        CarrosEnum tipo = CarrosEnum.valueOf(tipoCarro);
        imposto = getImposto(Estado);

        switch (tipo){
            case CAPTIVA:
                return new Captiva("captiva", "captiva", "captiva", 10);
            case ONIX:
                return new Onix("onix", "onix", "onix", 20);
            case PALIO:
                return new Palio("palio", "palio", "palio", 30);
            default:
                return null;
        }
    }

    public ImpostoAbstractFactory getImposto(String estado){
        if (estado.equals("Goias")){
            return new ImpostosGoiasAbstractFactory();
        } else if (estado.equals("Para")){
            return new ImpostosParaAbstractFactory();
        }
        return null;
    }

    public String ImprimeImposto(){
        return imposto.getICMS().imposto();
    }
}
