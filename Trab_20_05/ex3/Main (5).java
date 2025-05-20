import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		       Scanner sc = new Scanner(System.in);
		        ArrayList<Livro> listaDeLivros = new ArrayList<>();

		     
		        listaDeLivros.add(new Livro("Machado de Assis" , "Dom Casmurro"));
		        listaDeLivros.add(new Livro("Paulo Coelho", "O Alquimista"));
		        listaDeLivros.add(new Livro("Jorge Amado", "Capitães da Areia"));
		        
		        // Chamando o método para imprimir os livros
		        exibirLivros(listaDeLivros);
		    }

		    // Método que recebe a lista e imprime os dados de cada livro
		    public static void exibirLivros(ArrayList<Livro> livros) {
		        System.out.println("Lista de Livros:");
		        for (Livro livro : livros) {
		            livro.exibirLivro();
		            
		        }
		    }
		}