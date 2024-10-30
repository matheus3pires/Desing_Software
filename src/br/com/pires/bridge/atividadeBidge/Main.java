package br.com.pires.bridge.atividadeBidge;

public class Main {

    public static void main(String[] args) {
        Plataforma email = new Email();
        Plataforma sms = new Sms();

        Mensagem mensagemUrgente = new MensagemUrgente(email);
        Mensagem mensagemNormal = new MensagemNormal(sms);

        mensagemUrgente.enviar("Sistema fora do ar!");
        mensagemNormal.enviar("Atualização disponível.");
    }
}
