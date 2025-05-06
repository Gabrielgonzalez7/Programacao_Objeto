package pkg6;

public class NotificacaoEmail extends Notificacao{
	  public void enviar() {
	        System.out.println("Enviando e-mail para destinatário único...");
	    }

	    // Sobrecarga: envia para um destinatário específico
	    public void enviar(String destinatario) {
	        System.out.println("Enviando e-mail para: " + destinatario);
	    }

	    // Sobrecarga: envia para vários destinatários
	    public void enviar(String[] destinatarios) {
	        System.out.println("Enviando e-mail para múltiplos destinatários:");
	        for (String d : destinatarios) {
	            System.out.println(" - " + d);
	        }
	    }
}
