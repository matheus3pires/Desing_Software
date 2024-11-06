package br.com.pires.composite.example;

public class TrechoOnibus implements Trecho{

    private String direcao;
    private double distancia;

    public TrechoOnibus(String direcao, double distancia) {
        this.direcao = direcao;
        this.distancia = distancia;
    }

    @Override
    public void imprime() {
        System.out.println("\n Va de onibus...");
        System.out.println(this.direcao);
        System.out.println("Distancia percorrida sera de: " + this.distancia);
    }
}
