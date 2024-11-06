package br.com.pires.composite.atividadeComposite;

import java.util.ArrayList;
import java.util.List;

public class Xepa implements Produto {

    private List<Produto> produtos;
    private String nome;

    public Xepa(String nome) {
        this.produtos = new ArrayList<Produto>();
        this.nome = nome;
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        this.produtos.remove(produto);
    }

    @Override
    public void imprimir() {
        System.out.println(nome + ": [Valor: R$ " + calcularValor() + "]");
        this.produtos.forEach(Produto::imprimir);
    }

    @Override
    public double calcularValor() {
        double valorTotal = 0;
        for (Produto produto: produtos){
            valorTotal = valorTotal + produto.calcularValor();
        }
        return valorTotal;
    }
}
