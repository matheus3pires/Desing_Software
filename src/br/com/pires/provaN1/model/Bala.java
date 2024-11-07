package br.com.pires.provaN1.model;

public class Bala extends Doce{
    private String sabor;
    private String marca;

    public Bala(String tipo, String sabor, String marca) {
        super(tipo);
        this.sabor = sabor;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Bala -> " + "tipo = " + tipo +
                ", sabor = " + sabor +
                ", marca = " + marca;
    }
}
