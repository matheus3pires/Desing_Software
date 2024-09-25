package br.com.pires.prototype.atividadePrototype.model;

import java.util.ArrayList;

public class Caminhao extends Veiculo{

    public Caminhao(ArrayList<Pneu> pneus) {
        super(pneus);
    }

    @Override
    public String toString() {
        return "Caminhão com " + pneus.size() + " pneus.";
    }
}
