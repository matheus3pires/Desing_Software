package br.com.pires.provaN1.model;

public class Bombom extends Doce{
    private String chocolate;
    private String recheio;
    private String cobertura;

    public Bombom(String tipo, String chocolate, String recheio, String cobertura) {
        super(tipo);
        this.chocolate = chocolate;
        this.recheio = recheio;
        this.cobertura = cobertura;
    }

    @Override
    public String toString() {
        return "Bombom -> " + "tipo = " + tipo +
                ", cobertura = " + cobertura +
                ", recheio = " + recheio +
                ", chocolate = " + chocolate;
    }
}
