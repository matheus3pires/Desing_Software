package factoryMethod.exampleNormal;

import javax.swing.*;

public class Carros {

    public static void main(String[] args) {
        boolean controle = true;
        Object[] opcoes = {"ONIX", "PALIO", "CAPTIVA"};
        Object tipoCarro;

        do {
            tipoCarro = JOptionPane.showInputDialog(null,
                    "Deseja finalizar o programa?", "Finalizacao",
                    JOptionPane.PLAIN_MESSAGE, null, opcoes, "ONIX");

            if (tipoCarro.equals("ONIX")) {
                Onix obj = new Onix("OnixLT", "GM", "Direção Hidraulica, Ar Condiocionado", 800);
                String saida = "Marca: " + obj.getMarca() + "\n";
                saida += "Modelo: " + obj.getModelo() + "\n";
                saida += "Lista de opcionais: " + obj.getAcessorios() + "\n";
                saida += "Preço: " + obj.getValor() + "\n";

                JOptionPane.showMessageDialog(null, saida);
            }

            if (tipoCarro.equals("CAPTIVA")) {
                Captiva obj = new Captiva("Captiva", "GM", "Ar Condiocionado", 8000);
                String saida = "Marca: " + obj.getMarca() + "\n";
                saida += "Modelo: " + obj.getModelo() + "\n";
                saida += "Lista de opcionais: " + obj.getAcessorios() + "\n";
                saida += "Preço: " + obj.getValor() + "\n";

                JOptionPane.showMessageDialog(null, saida);
            }

            if (tipoCarro.equals("PALIO")) {
                Palio obj = new Palio("Palio", "GM", "Direção", 20);
                String saida = "Marca: " + obj.getMarca() + "\n";
                saida += "Modelo: " + obj.getModelo() + "\n";
                saida += "Lista de opcionais: " + obj.getAcessorios() + "\n";
                saida += "Preço: " + obj.getValor() + "\n";

                JOptionPane.showMessageDialog(null, saida);
            }
        } while (controle);
    }
}
