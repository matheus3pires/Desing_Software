package singleton.atividade;

import singleton.atividade.model.Piloto;
import singleton.atividade.model.Pista;
import singleton.exampleComSingleton.factory.LeaderFactory;

import java.util.Optional;

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
