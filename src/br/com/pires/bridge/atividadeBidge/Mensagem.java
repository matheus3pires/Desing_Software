package br.com.pires.bridge.atividadeBidge;

public abstract class Mensagem {

    Plataforma plataforma;

    public Mensagem(Plataforma plataforma) {
        this.plataforma = plataforma;
    }

    public abstract void enviar(String conteudo);
}
