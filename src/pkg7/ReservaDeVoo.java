package pkg7;

public class ReservaDeVoo extends Reserva {
	private String destino;

    public ReservaDeVoo(String nomeCliente, String destino) {
        super(nomeCliente);
        this.destino = destino;
    }

    @Override
    public void cancelar() {
        System.out.println("Cancelamento da reserva de voo para " + nomeCliente +
                           " com destino a " + destino + " realizado com taxa de 20%.");
    }

    @Override
    public void adicionar() {
        System.out.println("Reserva de voo (classe econômica) adicionada para " + nomeCliente +
                           " com destino a " + destino + ".");
    }

    // Sobrecarga: especificando a classe do voo
    public void adicionar(String classe) {
        System.out.println("Reserva de voo (classe " + classe + ") adicionada para " +
                           nomeCliente + " com destino a " + destino + ".");
    }
}
