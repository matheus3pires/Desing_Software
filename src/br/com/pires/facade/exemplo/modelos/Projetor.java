package br.com.pires.facade.exemplo.modelos;

public class Projetor {

    private int modo;

    public Projetor() {
        this.modo = 0;
    }

    public void on(){
        System.out.println("Projetor [ON]");
    }

    public void off(){
        System.out.println("Projetor [OFF]");
    }

    public void setModo() {
        if (modo == 0){
            modo = 1;
            System.out.println("Projetor em modo Widescreen");
        } else {
            modo = 0;
            System.out.println("Projetor em modo Normal.");
        }

    }
}
