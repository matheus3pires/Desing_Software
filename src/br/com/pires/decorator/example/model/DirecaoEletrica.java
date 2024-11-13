package br.com.pires.decorator.example.model;

public class DirecaoEletrica extends Acessorio{

    private Carro veiculo;

    public DirecaoEletrica(Carro veiculo) {
        this.veiculo = veiculo;
    }

    public String getDescricao() {
        veiculo.descricao += ", Direção Eletrica";
        return veiculo.descricao;
    }

    public double preco(){
        return veiculo.preco() + 7000.00;
    }
}
