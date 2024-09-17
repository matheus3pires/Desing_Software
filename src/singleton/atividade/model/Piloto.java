package singleton.atividade.model;

public class Piloto {

    private String nome;
    private Pista pistaCorrida;

    public Piloto(String nome, Pista pistaCorrida) {
        this.nome = nome;
        this.pistaCorrida = pistaCorrida;
        Pista.setQuantidadeCorredores(Pista.getQuantidadeCorredores() + 1);
    }

    public void getFichaPiloto() {
        System.out.println("\nDados do Corredor \n" +
                "Nome: " + this.nome + "\n" +
                "Nome da Pista: " + this.pistaCorrida.getNome() + "\n" +
                "ID Pista: " + this.pistaCorrida.gethashCode() + "\n" +
                "Quantidade de Corredores: " + Pista.getQuantidadeCorredores());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pista getPistaCorrida() {
        return pistaCorrida;
    }

    public void setPistaCorrida(Pista pistaCorrida) {
        this.pistaCorrida = pistaCorrida;
    }
}
