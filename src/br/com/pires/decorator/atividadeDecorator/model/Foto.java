package br.com.pires.decorator.atividadeDecorator.model;

public class Foto extends BrindeDecorator{

    public Foto(Brinde brinde) {
        super(brinde);
    }

    @Override
    public String getDescricao() {
        return brinde.getDescricao() + "\n \t |-> Com a Foto";
    }
}
