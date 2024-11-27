package br.com.pires.facade.atividadeFacade;

import br.com.pires.facade.atividadeFacade.modelos.ales.Ale;

public class Main {

    public static void main(String[] args) {
        System.out.println("Produzindo Ales:");
        AlesFacade ales = new AlesFacade();
        ales.produzirAle();
        ales.produzirPorter();
        ales.produzirStout();
        ales.produzirTrigo();

        System.out.println("\nProduzindo Lagers:");
        LagersFacade lagers = new LagersFacade();
        lagers.produzirLager();
        lagers.produzirMunich();
        lagers.produzirVienna();
    }
}
