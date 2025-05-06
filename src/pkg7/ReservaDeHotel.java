package pkg7;

public class ReservaDeHotel extends Reserva {
	 private String hotel;

	    public ReservaDeHotel(String nomeCliente, String hotel) {
	        super(nomeCliente);
	        this.hotel = hotel;
	    }

	    @Override
	    public void cancelar() {
	        System.out.println("Cancelamento da reserva de hotel para " + nomeCliente +
	                            " realizado com taxa de 10%.");
	    }

	    @Override
	    public void adicionar() {
	        System.out.println("Reserva de hotel adicionada para " + nomeCliente +
	                           " no " + hotel + ".");
	    }
	
}
