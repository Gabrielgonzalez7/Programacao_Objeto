import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Jogador> jogadores = new ArrayList<>();
		Titular titular = new Titular();
			
		System.out.println("Quantos jogadores deseja cadastrar? ");
		int quantidade = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<quantidade ;i++) {
		System.out.println("Jogador " + (i +1) + ":");
		System.out.println("Digite o nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Digite a nota final: ");
		double nota = sc.nextDouble();
		sc.nextLine();
		 Jogador jogador = new Jogador(nome, nota);
         jogadores.add(jogador);
     }

     System.out.println("\nStatus dos jogadores:");
     titular.imprimirStatusLista(jogadores);

     sc.close();
		}
		
	}