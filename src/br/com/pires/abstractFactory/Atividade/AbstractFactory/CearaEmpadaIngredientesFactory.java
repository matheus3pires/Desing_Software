package br.com.pires.abstractFactory.Atividade.AbstractFactory;

public class CearaEmpadaIngredientesFactory extends SalgadoIngredientesFactory{

    @Override
    public String criarMassa() {
        return "Crepioca";
    }

    @Override
    public String criarMolho() {
        return "Camarao";
    }

    @Override
    public String criarRecheio() {
        return "Peixe";
    }
}
