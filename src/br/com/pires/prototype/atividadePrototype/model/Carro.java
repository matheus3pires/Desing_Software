package br.com.pires.prototype.atividadePrototype.model;

import java.util.ArrayList;

public class Carro extends Veiculo{

    public Carro(ArrayList<Pneu> pneus) {
        super(pneus);
    }

    @Override
    public String toString() {
        return "Carro com " + pneus.size() + " pneus.";
    }
}
