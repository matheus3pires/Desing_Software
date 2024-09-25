package br.com.pires.prototype.atividadePrototype.model;

import java.util.ArrayList;

public abstract class Veiculo {

    public ArrayList<Pneu> pneus;

    public Veiculo(ArrayList<Pneu> pneus) {
        this.pneus = pneus;
    }

    public ArrayList<Pneu> getPneus() {
        return pneus;
    }

    public void setPneus(ArrayList<Pneu> pneus) {
        this.pneus = pneus;
    }
}
