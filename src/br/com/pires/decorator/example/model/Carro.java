package br.com.pires.decorator.example.model;

public abstract class Carro {

    public String descricao;

    public Carro() {
        this.descricao = "Carro";
    }

    public String getDescricao() {
        return descricao;
    }

    public abstract double preco();
}
