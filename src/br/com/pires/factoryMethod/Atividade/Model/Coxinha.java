package br.com.pires.factoryMethod.Atividade.Model;

public class Coxinha extends Salgado {

    private String embalagem;

    public Coxinha(String massa, String molho, String recheio, String embalagem) {
        super(massa, molho, recheio);
        this.embalagem = embalagem;
    }

    @Override
    public String descricao() {
        String saida = "Massa: " + getMassa() + "\n";
        saida += "Molho: " + getMolho()+ "\n";
        saida += "Recheio: " + getRecheio() + "\n";
        saida += "Embalagem: " + getEmbalagem() + "\n";

        return saida;
    }

    public String getEmbalagem() {
        return embalagem;
    }

    public void setEmbalagem(String embalagem) {
        this.embalagem = embalagem;
    }
}
