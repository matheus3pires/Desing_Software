package br.com.pires.composite.example;

public class Composite {

    public static void main(String[] args) {
        Trecho trechoA = new TrechoCarro("Casa até aeroporto", 3.5);
        Trecho trechoB = new TrechoAviao("Aeroporto até Bora Bora", 10000.00);
        Trecho trechoC = new TrechoOnibus("Bora Bora até resort", 3.2);
        Trecho trechoD = new TrechoAndando("Rua sem fim até finalmente resort", 2.1);

        Percuso viagemIda = new Percuso();
        viagemIda.adiciona(trechoA);
        viagemIda.adiciona(trechoB);
        viagemIda.adiciona(trechoC);
        viagemIda.adiciona(trechoD);

        viagemIda.imprime();

        // viagemVolta...
    }
}
