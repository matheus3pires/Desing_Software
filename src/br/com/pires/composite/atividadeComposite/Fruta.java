package br.com.pires.composite.atividadeComposite;

public class Fruta implements Produto{

    private String nome;
    private double valor;

    public Fruta(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public void imprimir() {
        System.out.println("|----Produto: " + this.nome + ". [Valor = R$ "+ this.valor +"]");
    }

    @Override
    public double calcularValor() {
        return valor;
    }

}
