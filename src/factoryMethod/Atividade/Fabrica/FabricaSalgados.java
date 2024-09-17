package factoryMethod.Atividade.Fabrica;

import factoryMethod.Atividade.Model.Coxinha;
import factoryMethod.Atividade.Model.Empada;
import factoryMethod.Atividade.Model.Esfirra;
import factoryMethod.Atividade.Model.Salgado;

public class FabricaSalgados {

    public enum Salgados {COXINHA, EMPADA, ESFIRRA;}

    public static Salgado fabricar(String tipoSalgado){
        Salgados tipo = Salgados.valueOf(tipoSalgado);

        switch (tipo){
            case COXINHA:
                return new Coxinha("Fina","Pequi","Frango","Caixa");
            case EMPADA:
                return new Empada("Podre","Tomate","Calabresa","Descartável");
            case ESFIRRA:
                return new Esfirra("Crepioca","Camarão","Peixe","Suco");
            default:
                return null;
        }
    }


}
