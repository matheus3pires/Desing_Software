package br.com.pires.factoryMethod.exampleFactory;

import br.com.pires.factoryMethod.exampleFactory.fabrica.FabricaCarros;

import javax.swing.*;

public class FabricMethodCarros {

    public static void main(String[] args) {
        boolean controle = true;
        Object[] opcoes = {"ONIX", "PALIO", "CAPTIVA"};
        Object tipoCarro;
        Carro obj = null;

        do {
            tipoCarro = JOptionPane.showInputDialog(null,
                    "Deseja finalizar o programa?", "Finalizacao",
                    JOptionPane.PLAIN_MESSAGE, null, opcoes, "ONIX");
            obj = FabricaCarros.getCarro(tipoCarro.toString());
            imprime(obj);
        } while (controle);
    }

    private static void imprime(Carro obj) {
        String saida = "Marca: " + obj.getMarca() + "\n";
        saida += "Modelo: " + obj.getModelo() + "\n";
        saida += "Lista de opcionais: " + obj.getAcessorios() + "\n";
        saida += "Preço: " + obj.getValor() + "\n";

        JOptionPane.showMessageDialog(null, saida);
    }
}
