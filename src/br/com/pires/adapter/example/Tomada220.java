package br.com.pires.adapter.example;

public class Tomada220 implements Energia220{
    private double valor;

    public Tomada220() {
        this.valor = 220.00;
    }

    @Override
    public double getEnergia() {
        return this.valor;
    }

}