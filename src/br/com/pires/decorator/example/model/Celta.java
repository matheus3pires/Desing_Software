package br.com.pires.decorator.example.model;

public class Celta extends Carro{

    public Celta() {
        descricao = "Celta LT";
    }

    @Override
    public double preco() {
        return 30000.00;
    }
}
