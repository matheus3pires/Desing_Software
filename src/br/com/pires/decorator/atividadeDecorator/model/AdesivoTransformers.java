package br.com.pires.decorator.atividadeDecorator.model;

public class AdesivoTransformers extends BrindeDecorator{

    public AdesivoTransformers(Brinde brinde) {
        super(brinde);
    }

    @Override
    public String getDescricao() {
        return brinde.getDescricao() + "\n \t |-> Com a Adesivo Transformers";
    }
}
