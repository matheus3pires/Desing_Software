package br.com.pires.bridge.atividadeBidge;

public class Sms implements Plataforma{

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}
