package br.com.pires.prototype.example.model;

public class Triangulo extends Figura{

    public Triangulo() {
        tipo = "Triangulo";
        area = 20;
    }

    @Override
    public void desenhar() {
        System.out.println("DESENHANDO UM TRIANGULO.");
    }
}
