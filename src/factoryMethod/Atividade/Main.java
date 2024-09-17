package factoryMethod.Atividade;

import factoryMethod.Atividade.Fabrica.FabricaSalgados;
import factoryMethod.Atividade.Model.Salgado;
import factoryMethod.exampleFactory.Carro;
import factoryMethod.exampleFactory.fabrica.FabricaCarros;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        boolean controle = true;
        Object[] opcoes = {"COXINHA", "EMPADA", "ESFIRRA"};
        Object tipoSalgado;
        Salgado obj = null;

        do {
            tipoSalgado = JOptionPane.showInputDialog(null,
                    "Ecolha uma opção do cardápio", "Cardápio",
                    JOptionPane.PLAIN_MESSAGE, null, opcoes, "COXINHA");
            obj = FabricaSalgados.fabricar(tipoSalgado.toString());
            imprime(obj);
        } while (controle);
    }

    private static void imprime(Salgado obj) {
        JOptionPane.showMessageDialog(null, obj.descricao());
    }

}
