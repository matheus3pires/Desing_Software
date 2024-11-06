package br.com.pires.composite.example;

public class TrechoAndando implements Trecho{

    private String direcao;
    private double distancia;

    public TrechoAndando(String direcao, double distancia) {
        this.direcao = direcao;
        this.distancia = distancia;
    }

    @Override
    public void imprime() {
        System.out.println("\n Va Andando...");
        System.out.println(this.direcao);
        System.out.println("Distancia percorrida sera de: " + this.distancia);
    }
}
