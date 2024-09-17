package br.com.pires.builder.atividadeBuilder;

import br.com.pires.builder.atividadeBuilder.builder.CarroBuilder;
import br.com.pires.builder.atividadeBuilder.builder.CarroEsportivoBuilder;
import br.com.pires.builder.atividadeBuilder.builder.CarroImportadoBuilder;
import br.com.pires.builder.atividadeBuilder.builder.CarroPopularBuilder;
import br.com.pires.builder.atividadeBuilder.director.CarroDirector;

public class Main {
    public static void main(String[] args) {
        order("Palio", new CarroPopularBuilder());
        order("Civic", new CarroImportadoBuilder());
        order("Jaguar ", new CarroEsportivoBuilder());
    }

    public static void order(String nameCarro, CarroBuilder builder) {
        System.out.println("Vendendo um " + nameCarro);
        CarroDirector director = new CarroDirector(builder);
        director.construirCarro();
        System.out.println(director.getCarro());
        System.out.println("------------------");
    }
}
