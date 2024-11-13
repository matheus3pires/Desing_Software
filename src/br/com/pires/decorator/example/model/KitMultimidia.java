package br.com.pires.decorator.example.model;

public class KitMultimidia extends Acessorio{

    private Carro veiculo;

    public KitMultimidia(Carro veiculo) {
        this.veiculo = veiculo;
    }

    public String getDescricao() {
        veiculo.descricao += ", Kit Multimidia";
        return veiculo.descricao;
    }

    public double preco(){
        return veiculo.preco() + 2000.00;
    }
}
