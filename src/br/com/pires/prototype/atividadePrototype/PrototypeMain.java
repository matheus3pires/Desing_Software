package br.com.pires.prototype.atividadePrototype;

import br.com.pires.prototype.atividadePrototype.model.Caminhao;
import br.com.pires.prototype.atividadePrototype.model.Carro;
import br.com.pires.prototype.atividadePrototype.model.Pneu;

import java.util.ArrayList;

public class PrototypeMain {

    public static Pneu clonarPneu(Pneu pneuOriginal){
        return (Pneu) pneuOriginal.clone();
    }

    public static void main(String[] args) {
        Pneu pneuCarro = new Pneu("Firestone",16);
        Pneu pneuCaminhao = new Pneu("Michelin",30);

        ArrayList<Pneu> pneusCarro = new ArrayList<Pneu>();
        pneusCarro.add(pneuCarro);
        for (int i = 0; i < 3; i++) {
            pneusCarro.add(clonarPneu(pneuCarro));
        }

        Carro carro = new Carro(pneusCarro);
        System.out.println(carro.toString());
        System.out.println(carro.getPneus().toString());

        ArrayList<Pneu> pneusCaminhao = new ArrayList<Pneu>();
        pneusCaminhao.add(pneuCaminhao);
        for (int i = 0; i < 5; i++) {
            pneusCaminhao.add(clonarPneu(pneuCaminhao));
        }

        Caminhao caminhao = new Caminhao(pneusCaminhao);
        System.out.println(caminhao.toString());
        System.out.println(caminhao.getPneus().toString());
    }
}
