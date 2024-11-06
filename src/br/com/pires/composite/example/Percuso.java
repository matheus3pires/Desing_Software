package br.com.pires.composite.example;

import java.util.ArrayList;
import java.util.List;

public class Percuso implements Trecho {

    private List<Trecho> trechos;

    public Percuso() {
        this.trechos = new ArrayList<Trecho>();
    }

    @Override
    public void imprime() {
        for (Trecho trecho : this.trechos) {
            trecho.imprime();
        }
    }

    public void adiciona(Trecho trecho) {
        this.trechos.add(trecho);
    }

    public void remove(Trecho trecho) {
        this.trechos.remove(trecho);
    }
}
