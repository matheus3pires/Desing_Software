package br.com.pires.adapter.example;

public class Ventilador {
    private String marca;
    private Energia110 energia;

    public Ventilador(String marca, Energia110 tomada) {
        this.marca = marca;
        this.energia = tomada;
    }

    @Override
    public String toString() {
        return "Ventilador{" + "marca=" + marca + ", energia=" + energia.getEnergia() + " V}";
    }

}
