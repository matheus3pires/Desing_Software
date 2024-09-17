package br.com.pires.builder.atividadeBuilder.director;

import br.com.pires.builder.atividadeBuilder.builder.CarroBuilder;
import br.com.pires.builder.atividadeBuilder.model.Carro;

public class CarroDirector {

    private CarroBuilder builder;

    public CarroDirector(CarroBuilder builder) {
        this.builder = builder;
    }

    public void construirCarro() {
        builder.buildTipo();
        builder.buildTransmissao();
        builder.buildBancos();
        builder.buildAcessorio();
        builder.buildSensor();
    }

    public Carro getCarro() {
        return builder.getCarro();
    }
}
