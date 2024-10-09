package br.com.pires.provaN1.factory;

import br.com.pires.provaN1.model.Doce;
import br.com.pires.singleton.atividade.model.Pista;

public class FabricadeDocesSingleton {

    protected Doce produto;
    static protected FabricadeDoces instanciaBombom;
    static protected FabricadeDoces instanciaBala;

    public static FabricadeDoces getInstancia(String tipo){
        if (tipo.equals("bala")){
            if (instanciaBala == null){
                instanciaBala = new FabricadeBala();
            }
            return instanciaBala;

        } else if (tipo.equals("bombom")) {
            if (instanciaBombom == null){
                instanciaBombom = new FabricadeBombom();
            }
            return instanciaBombom;
        }

        return null;
    }

}
