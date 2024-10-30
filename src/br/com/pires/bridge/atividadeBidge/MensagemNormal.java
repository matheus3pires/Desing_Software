package br.com.pires.bridge.atividadeBidge;

public class MensagemNormal extends Mensagem{

    public MensagemNormal(Plataforma plataforma) {
        super(plataforma);
    }

    @Override
    public void enviar(String conteudo) {
        plataforma.enviarMensagem("[Normal] " + conteudo);
    }
}
