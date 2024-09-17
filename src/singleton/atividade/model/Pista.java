package singleton.atividade.model;

public class Pista {

    private String nome;
    private static int quantidadeCorredores;
    private static Pista singleton;

    public static Pista getInstance(){
        if (singleton == null){
            singleton = new Pista("Autodromo Internacional de Goiania ");
        }
        return singleton;
    }

    private Pista(String nome) {
        this.nome = nome;
    }

    public int gethashCode(){
        return this.hashCode();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static int getQuantidadeCorredores() {
        return quantidadeCorredores;
    }

    public static void setQuantidadeCorredores(int quantidadeCorredores) {
        Pista.quantidadeCorredores = quantidadeCorredores;
    }
}
