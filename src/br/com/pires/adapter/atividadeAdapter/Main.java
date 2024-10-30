package br.com.pires.adapter.atividadeAdapter;

public class Main {

    public static void main(String[] args) {
        TemperaturaCelsius temperaturaCelsius = new TemperaturaCelsius(25.0);

        System.out.println("Temperatura fornecida em Celsius = " + temperaturaCelsius.getTemperatura());

        TemperaturaFahrenheit temperaturraAdaptada = new TemperaturaAdapter(temperaturaCelsius);

        Cliente cliente = new Cliente(temperaturraAdaptada);
        cliente.displayTemperatura();
    }
}
