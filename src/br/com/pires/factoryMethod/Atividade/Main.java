package br.com.pires.factoryMethod.Atividade;

import br.com.pires.factoryMethod.Atividade.Fabrica.FabricaSalgados;
import br.com.pires.factoryMethod.Atividade.Model.Salgado;

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
