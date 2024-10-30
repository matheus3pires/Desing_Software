package br.com.pires.bridge.atividadeBidge;

public class Email implements Plataforma{

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando Email: " + mensagem);
    }
}
