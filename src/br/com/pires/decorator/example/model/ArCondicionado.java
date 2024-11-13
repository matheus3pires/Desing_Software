package br.com.pires.decorator.example.model;

public class ArCondicionado extends Acessorio{

    private Carro veiculo;

    public ArCondicionado(Carro veiculo) {
        this.veiculo = veiculo;
    }

    public String getDescricao() {
        veiculo.descricao += ", Ar Condicionado";
        return veiculo.descricao;
    }

    public double preco(){
        return veiculo.preco() + 4000.00;
    }
}
