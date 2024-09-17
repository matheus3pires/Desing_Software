package factoryMethod.exampleFactory.fabrica;

import factoryMethod.exampleFactory.Captiva;
import factoryMethod.exampleFactory.Carro;
import factoryMethod.exampleFactory.Onix;
import factoryMethod.exampleFactory.Palio;

public class FabricaCarros {
    public enum Carros {CAPTIVA, ONIX, PALIO;}

    public static Carro getCarro(String tipoCarro){
        Carros tipo = Carros.valueOf(tipoCarro);

        switch (tipo){
            case CAPTIVA:
                return new Captiva("CAPTIVA", "", "", 20);
            case ONIX:
                return new Onix("ONIX", "", "", 20);
            case PALIO:
                return new Palio("PALIO", "", "", 20);
            default:
                return null;
        }
    }
}
