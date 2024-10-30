package br.com.pires.bridge.atividadeBidge;

public class MensagemUrgente extends Mensagem{

    public MensagemUrgente(Plataforma plataforma) {
        super(plataforma);
    }

    @Override
    public void enviar(String conteudo) {
        plataforma.enviarMensagem("[Urgente] " + conteudo);
    }
}
