package br.com.pires.factoryMethod.exampleFactory;

public class Palio extends Carro{

    public Palio(String modelo, String marca, String acessorios, float valor) {
        super(modelo, marca, acessorios, valor);
    }

    @Override
    public String descricao() {
        return "Palio";
    }
}
