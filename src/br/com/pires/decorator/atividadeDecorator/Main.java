package br.com.pires.decorator.atividadeDecorator;

import br.com.pires.decorator.atividadeDecorator.model.*;

public class Main {

    public static void main(String[] args) {
        Brinde brinde1 = new Caneta();
        System.out.println("Brinde 1: " + brinde1.getDescricao());

        Brinde brinde2 = new Caneca();
        System.out.println("Brinde 2: " + brinde2.getDescricao());

        Brinde brinde3 = new Foto(new Caneca());
        System.out.println("Brinde 3: " + brinde3.getDescricao());

        Brinde brinde4 = new CorAzul(new AdesivoTransformers(new Garrafa()));
        System.out.println("Brinde 4: " + brinde4.getDescricao());
    }
}
