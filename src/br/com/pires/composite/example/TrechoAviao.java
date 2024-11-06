package br.com.pires.composite.example;

public class TrechoAviao implements Trecho{

    private String direcao;
    private double distancia;

    public TrechoAviao(String direcao, double distancia) {
        this.direcao = direcao;
        this.distancia = distancia;
    }

    @Override
    public void imprime() {
        System.out.println("\n Va de avião...");
        System.out.println(this.direcao);
        System.out.println("Distancia percorrida sera de: " + this.distancia);
    }
}
