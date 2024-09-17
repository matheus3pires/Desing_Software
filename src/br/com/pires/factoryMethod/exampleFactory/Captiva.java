package br.com.pires.factoryMethod.exampleFactory;

public class Captiva extends Carro{

    public Captiva(String modelo, String marca, String acessorios, float valor) {
        super(modelo, marca, acessorios, valor);
    }

    @Override
    public String descricao() {
        return "Carro do tip SUV para 5 pessoas";
    }
}
