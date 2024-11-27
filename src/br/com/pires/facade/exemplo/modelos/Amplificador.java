package br.com.pires.facade.exemplo.modelos;

public class Amplificador {

    private int volume;

    public void on(){
        System.out.println("Amplificador [ON]");
    }

    public void off(){
        System.out.println("Amplificador [OFF]");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Volume em: " + this.volume);
    }
}
