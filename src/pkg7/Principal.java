package pkg7;

public class Principal {

	public static void main(String[] args) {
		 Reserva[] reservas = new Reserva[3];

	        reservas[0] = new ReservaDeHotel("Gabriel", "Hotel Morotim");
	        reservas[1] = new ReservaDeVoo("Andrisa", "Paso de Los Libres");
	        reservas[2] = new Reserva("Enner");

	        // Adicionar reservas
	        for (Reserva r : reservas) {
	            r.adicionar();
	        }

	        // Usando a sobrecarga diretamente
	        if (reservas[1] instanceof ReservaDeVoo) {
	            ((ReservaDeVoo) reservas[1]).adicionar("executiva");
	        }

	        // Cancelar reservas
	        System.out.println("\n--- Cancelamentos ---");
	        for (Reserva r : reservas) {
	            r.cancelar();
	        }
	}

}
