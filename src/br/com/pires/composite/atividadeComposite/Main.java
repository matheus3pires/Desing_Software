package br.com.pires.composite.atividadeComposite;

public class Main {

    public static void main(String[] args) {
        Produto pera = new Fruta("Pera", 5.55);
        Produto banana = new Fruta("Banana", 6.7);

        Produto alface = new Verdura("Alface", 7.0);
        Produto cenoura = new Verdura("Cenoura", 9.0);

        Xepa caixaFrutas = new Xepa("Caixa de Frutas");
        caixaFrutas.adicionarProduto(pera);
        caixaFrutas.adicionarProduto(banana);
        caixaFrutas.imprimir();


        Xepa caixaVerduras = new Xepa("Caixa de Verduras");
        caixaVerduras.adicionarProduto(alface);
        caixaVerduras.adicionarProduto(cenoura);
        caixaVerduras.imprimir();

        Xepa caixaMista = new Xepa("Caixa Mista");
        caixaMista.adicionarProduto(pera);
        caixaMista.adicionarProduto(banana);
        caixaMista.adicionarProduto(alface);
        caixaMista.adicionarProduto(cenoura);
        caixaMista.imprimir();
    }
}
