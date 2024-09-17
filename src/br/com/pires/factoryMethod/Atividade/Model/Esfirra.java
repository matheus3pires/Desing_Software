package br.com.pires.factoryMethod.Atividade.Model;

public class Esfirra extends Salgado {

    private String acompanhamento;

    public Esfirra(String massa, String molho, String recheio, String acompanhamento) {
        super(massa, molho, recheio);
        this.acompanhamento = acompanhamento;
    }

    @Override
    public String descricao() {
        String saida = "Massa: " + getMassa() + "\n";
        saida += "Molho: " + getMolho()+ "\n";
        saida += "Recheio: " + getRecheio() + "\n";
        saida += "Acompanhamento: " + getAcompanhamento() + "\n";

        return saida;
    }

    public String getAcompanhamento() {
        return acompanhamento;
    }

    public void setAcompanhamento(String acompanhamento) {
        this.acompanhamento = acompanhamento;
    }
}
