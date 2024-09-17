package abstractFactory.exampleAula;



import abstractFactory.exampleAula.Factory.FabricaCarros;
import abstractFactory.exampleAula.Models.Carros.Carro;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        FabricaCarros fabricaCarros = new FabricaCarros();
        boolean controle = true;
        Object[] opcoes = {"ONIX", "PALIO", "CAPTIVA"};
        Object tipoCarro;
        Carro obj = null;

        // TODO - TEM Q ARRUMAR DPS
        do {
            tipoCarro = JOptionPane.showInputDialog(null,
                    "Deseja finalizar o programa?", "Finalizacao",
                    JOptionPane.PLAIN_MESSAGE, null, opcoes, "ONIX");
//            obj = FabricaCarros.getCarro(tipoCarro.toString(), "Para");
            imprime(obj);
        } while (controle);
    }

    private static void imprime(Carro obj) {
        JOptionPane.showMessageDialog(null, obj.descricao());
    }
}
