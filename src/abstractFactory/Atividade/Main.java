package abstractFactory.Atividade;

import abstractFactory.Atividade.Factory.SalgadosFactory;

import javax.swing.*;

public class Main {

    static SalgadosFactory salgadosFactory = new SalgadosFactory();

    public static void main(String[] args) {
        boolean controle = true;
        Object[] opcoes = {"Coxinha de Goiás", "Empada de Goiás",
                "Coxinha de Ceará", "Empada de Ceará"};
        Object tipoSalgado;

        do {
            tipoSalgado = JOptionPane.showInputDialog(null,
                    "Ecolha uma opção do cardápio.", "Cardápio",
                    JOptionPane.PLAIN_MESSAGE, null, opcoes, "Coxinha de Goiás");

            if(tipoSalgado.equals("Coxinha de Goiás")){
                salgadosFactory.assarSalgado("COXINHA", "GOIAS");
            } else if(tipoSalgado.equals("Empada de Goiás")){
                salgadosFactory.assarSalgado("EMPADA", "GOIAS");
            } else if(tipoSalgado.equals("Coxinha de Ceará")){
                salgadosFactory.assarSalgado("COXINHA", "CEARA");
            } else if(tipoSalgado.equals("Empada de Ceará")){
                salgadosFactory.assarSalgado("EMPADA", "CEARA");
            }
            imprime();
        } while (controle);
    }

    private static void imprime() {
        JOptionPane.showMessageDialog(null, salgadosFactory.toString());
    }
}
