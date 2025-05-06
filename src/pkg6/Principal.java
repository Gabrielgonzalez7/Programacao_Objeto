package pkg6;

public class Principal {

	public static void main(String[] args) {
		Notificacao notificacao = new Notificacao();
        notificacao.enviar();

        // Notificação por e-mail
        NotificacaoEmail email = new NotificacaoEmail();
        email.enviar(); // método sobrescrito
        email.enviar("joao@email.com"); // sobrecarga para um
        email.enviar(new String[]{"ana@email.com", "maria@email.com"}); // sobrecarga para vários

        // Notificação por app
        NotificacaoApp app = new NotificacaoApp();
        app.enviar(); // método sobrescrito

	}

}
