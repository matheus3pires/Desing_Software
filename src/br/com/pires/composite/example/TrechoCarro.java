package br.com.pires.composite.example;

public class TrechoCarro implements Trecho{

    private String direcao;
    private double distancia;

    public TrechoCarro(String direcao, double distancia) {
        this.direcao = direcao;
        this.distancia = distancia;
    }

    @Override
    public void imprime() {
        System.out.println("\n Va de carro...");
        System.out.println(this.direcao);
        System.out.println("Distancia percorrida sera de: " + this.distancia);
    }
}
