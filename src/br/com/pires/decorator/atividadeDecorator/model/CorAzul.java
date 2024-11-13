package br.com.pires.decorator.atividadeDecorator.model;

public class CorAzul extends BrindeDecorator{

    public CorAzul(Brinde brinde) {
        super(brinde);
    }

    @Override
    public String getDescricao() {
        return brinde.getDescricao() + "\n \t |-> Com a Cor Azul";
    }
}
