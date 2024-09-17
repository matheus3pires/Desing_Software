package br.com.pires.factoryMethod.exampleFactory;

public class Onix extends Carro{

    public Onix(String modelo, String marca, String acessorios, float valor) {
        super(modelo, marca, acessorios, valor);
    }

    @Override
    public String descricao() {
        return "Onix";
    }
}
