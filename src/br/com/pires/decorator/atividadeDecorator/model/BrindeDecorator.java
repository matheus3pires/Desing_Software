package br.com.pires.decorator.atividadeDecorator.model;

public abstract class BrindeDecorator extends Brinde{

    protected Brinde brinde;

    public BrindeDecorator(Brinde brinde) {
        this.brinde = brinde;
    }

    @Override
    public String getDescricao() {
        return brinde.getDescricao();
    }
}
