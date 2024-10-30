package br.com.pires.adapter.atividadeAdapter;

class TemperaturaAdapter implements TemperaturaFahrenheit {

    private TemperaturaCelsius temperaturaCelsius;

    public TemperaturaAdapter(TemperaturaCelsius temperaturaCelsius) {
        this.temperaturaCelsius = temperaturaCelsius;
    }

    @Override
    public double getTemperatura() {
        return (temperaturaCelsius.getTemperatura() * 9 / 5) + 32;
    }
}
