package br.com.pires.decorator.example;

import br.com.pires.decorator.example.model.Captiva;
import br.com.pires.decorator.example.model.Carro;
import br.com.pires.decorator.example.model.KitMultimidia;

public class Decorator {

    public static void main(String[] args) {
        Carro carro1 = new Captiva();
        System.out.println("Carro 1: " + carro1.getDescricao());
        System.out.println("Preço: " + carro1.preco());

        carro1 = new KitMultimidia(carro1);
        System.out.println("Carro 1: " + carro1.getDescricao());
        System.out.println("Preço: " + carro1.preco());
    }
}
