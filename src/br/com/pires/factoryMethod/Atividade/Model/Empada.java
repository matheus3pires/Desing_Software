package br.com.pires.factoryMethod.Atividade.Model;

public class Empada extends Salgado {

    private String prato;

    public Empada(String massa, String molho, String recheio, String prato) {
        super(massa, molho, recheio);
        this.prato = prato;
    }

    @Override
    public String descricao() {
        String saida = "Massa: " + getMassa() + "\n";
        saida += "Molho: " + getMolho()+ "\n";
        saida += "Recheio: " + getRecheio() + "\n";
        saida += "Prato: " + getPrato() + "\n";

        return saida;
    }

    public String getPrato() {
        return prato;
    }

    public void setPrato(String prato) {
        this.prato = prato;
    }
}
