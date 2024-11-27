package br.com.pires.facade.exemplo.modelos;

public class Bluray {

    public void on(){
        System.out.println("Bluray [ON]");
    }

    public void off(){
        System.out.println("Bluray [OFF]");
    }

    public void play(String filme){
        System.out.println("Bluray inicou o filme: " + filme);
    }

    public void start(){
        System.out.println("Bluray [START]");
    }

    public void stop(){
        System.out.println("Bluray [STOP]");
    }
}
