package br.com.pires.factoryMethod.exampleFactory.fabrica;

import br.com.pires.factoryMethod.exampleFactory.Captiva;
import br.com.pires.factoryMethod.exampleFactory.Carro;
import br.com.pires.factoryMethod.exampleFactory.Onix;
import br.com.pires.factoryMethod.exampleFactory.Palio;

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
