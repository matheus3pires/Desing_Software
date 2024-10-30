package br.com.pires.adapter.atividadeAdapter;

public class Cliente {

    private TemperaturaFahrenheit temperatura;

    public Cliente(TemperaturaFahrenheit temperatura) {
        this.temperatura = temperatura;
    }

    public void displayTemperatura() {
        System.out.println("Temperatura em Fahrenheit: " + temperatura.getTemperatura());
    }
}
