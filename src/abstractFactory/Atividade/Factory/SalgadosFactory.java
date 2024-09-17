package abstractFactory.Atividade.Factory;

import abstractFactory.Atividade.AbstractFactory.*;
import abstractFactory.Atividade.Models.Coxinha;
import abstractFactory.Atividade.Models.Empada;
import abstractFactory.Atividade.Models.Salgado;

public class SalgadosFactory {
    public Salgado salgadinho;
    public SalgadoIngredientesFactory ingredientes;

    public enum SalgadoEnum{COXINHA, EMPADA};
    public enum RegiaoEnum{GOIAS, CEARA};

    public void assarSalgado(String tipo, String regiao){
        SalgadoEnum tipoSalgado = SalgadoEnum.valueOf(tipo);
        RegiaoEnum tipoRegiao = RegiaoEnum.valueOf(regiao);

        if(tipoRegiao.equals(RegiaoEnum.GOIAS)){
            this.ingredientes = getIngredientesCoxinha("GOIAS");
            if (tipoSalgado.equals(SalgadoEnum.COXINHA)){
                this.salgadinho = new Coxinha(
                        this.ingredientes.criarMassa(),
                        this.ingredientes.criarMolho(),
                        this.ingredientes.criarRecheio()
                );
            } else if (tipoSalgado.equals(SalgadoEnum.EMPADA)) {
                this.salgadinho = new Empada(
                        this.ingredientes.criarMassa(),
                        this.ingredientes.criarMolho(),
                        this.ingredientes.criarRecheio()
                );
            }
        } else if (tipoRegiao.equals(RegiaoEnum.CEARA)){
            this.ingredientes = getIngredientesEmpada("CEARA");
            if (tipoSalgado.equals(SalgadoEnum.COXINHA)){
                this.salgadinho = new Coxinha(
                        this.ingredientes.criarMassa(),
                        this.ingredientes.criarMolho(),
                        this.ingredientes.criarRecheio()
                );
            } else if (tipoSalgado.equals(SalgadoEnum.EMPADA)) {
                this.salgadinho = new Empada(
                        this.ingredientes.criarMassa(),
                        this.ingredientes.criarMolho(),
                        this.ingredientes.criarRecheio()
                );
            }
        }
    }

    public SalgadoIngredientesFactory getIngredientesCoxinha(String regiao){
        RegiaoEnum tipo = RegiaoEnum.valueOf(regiao);

        switch (tipo){
            case GOIAS:
                return new GoiasCoxinhaIngredientesFactory();
            case CEARA:
                return new CearaCoxinhaIngredientesFactory();
            default:
                return null;
        }
    }

    public SalgadoIngredientesFactory getIngredientesEmpada(String regiao){
        RegiaoEnum tipo = RegiaoEnum.valueOf(regiao);

        switch (tipo){
            case GOIAS:
                return new GoiasEmpadaIngredientesFactory();
            case CEARA:
                return new CearaEmpadaIngredientesFactory();
            default:
                return null;
        }
    }

    public Salgado getSalgadinho(){
        return this.salgadinho;
    }

    @Override
    public String toString() {
        return "Massa: " + this.salgadinho.getMassa() + "\n" +
                "Molho: " + this.salgadinho.getMolho() + "\n" +
                "Recheio: " + this.salgadinho.getRecheio();
    }
}
