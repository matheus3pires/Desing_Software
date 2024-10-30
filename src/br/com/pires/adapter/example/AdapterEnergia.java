package br.com.pires.adapter.example;

public class AdapterEnergia {

    private Energia220 energia;
    private Tomada110 convertido;

    public AdapterEnergia(Energia220 energia) {
        this.energia = energia;
        this.convertido = new Tomada110();
    }

    public Tomada110 getConvertido() {
        return convertido;
    }
}
