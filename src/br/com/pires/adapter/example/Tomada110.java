package br.com.pires.adapter.example;

public class Tomada110 implements Energia110{
    private double valor;

    public Tomada110() {
        this.valor = 110.00;
    }

    @Override
    public double getEnergia() {
        return this.valor;
    }

}