package br.com.pires.provaN1;

import br.com.pires.provaN1.factory.FabricadeDoces;
import br.com.pires.provaN1.factory.FabricadeDocesSingleton;

public class Main {

    public static void main(String[] args) {
        FabricadeDoces fabrica1 = FabricadeDocesSingleton.getInstancia("bala");
        fabrica1.criarDoce("goma", "morango", "7Belo", "", "", "");
        System.out.println(fabrica1.getProduto());

        FabricadeDoces fabrica2 = FabricadeDocesSingleton.getInstancia("bombom");
        fabrica2.criarDoce("barra", "", "", "amargo", "pistache","caramelo");
        System.out.println(fabrica2.getProduto());
    }
}
