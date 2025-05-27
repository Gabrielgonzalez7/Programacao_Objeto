
import java.util.List;
public class Titular {
	public void imprimirStatus(Jogador a) {
		if(a.getNotaFinal()>=6) {
			System.out.println(a.getNome() + " O jogador está apto à ser titular " + a.getNotaFinal());
		} else {
			System.out.println(a.getNome()+ " O jogador está inapto à ser titular " +a.getNotaFinal());
		}
	}
	public void imprimirStatusLista(List<Jogador> jogadores) {
        for (Jogador a : jogadores) {
            imprimirStatus(a);
        }
}
}
