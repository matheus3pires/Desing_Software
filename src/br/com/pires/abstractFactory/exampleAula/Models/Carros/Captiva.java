package br.com.pires.abstractFactory.exampleAula.Models.Carros;

public class Captiva extends Carro{

    public Captiva(String modelo, String marca, String acessorios, float valor) {
        super(modelo, marca, acessorios, valor);
    }

    @Override
    public String descricao() {
        String saida = "CAPTIVA Modelo: " + getModelo() + "\n";
        saida += "Marca: " + getMarca()+ "\n";
        saida += "Acessorios: " + getAcessorios() + "\n";
        saida += "Valor: " + getValor() + "\n";

        return saida;
    }
}
