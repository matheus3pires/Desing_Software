package br.com.pires.prototype.example.model;

public class Retangulo extends Figura {

    public Retangulo() {
        tipo = "Retangulo";
        area = 100;
    }

    @Override
    public void desenhar() {
        System.out.println("DESENHANDO UM RETANGULO.");
    }
}
