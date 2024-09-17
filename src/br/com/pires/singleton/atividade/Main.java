package br.com.pires.singleton.atividade;

import br.com.pires.singleton.atividade.model.Piloto;
import br.com.pires.singleton.atividade.model.Pista;

public class Main {
    public static void main(String[] args) {
        Pista pista = Pista.getInstance();

        Piloto pilotoUm = new Piloto("Japa", pista);
        pilotoUm.getFichaPiloto();

        Piloto pilotoDois = new Piloto("Goku", pista);
        pilotoDois.getFichaPiloto();

        Piloto pilotoTres = new Piloto("Jaspiron", pista);
        pilotoTres.getFichaPiloto();
    }
}
