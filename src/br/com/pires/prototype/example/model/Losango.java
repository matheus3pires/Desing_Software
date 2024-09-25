package br.com.pires.prototype.example.model;

public class Losango extends Figura {

    public Losango() {
        tipo = "Losango";
        area = 60;
    }

    @Override
    public void desenhar() {
        System.out.println("DESENHANDO UM LOSANGO.");
    }
}
