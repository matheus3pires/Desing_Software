package br.com.pires.decorator.example.model;

public class Captiva extends Carro{

    public Captiva() {
        descricao = "Captiva Sport 1.4";
    }

    @Override
    public double preco() {
        return 60000.00;
    }
}
