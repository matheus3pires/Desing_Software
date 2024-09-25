package br.com.pires.prototype.example.model;

public class Quadrado extends Figura {

    public Quadrado() {
        tipo = "Quadrado";
        area = 10;
    }

    @Override
    public void desenhar() {
        System.out.println("DESENHANDO UM QUADRADO.");
    }
}
