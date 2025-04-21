import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Coletando os dados do filme
	        System.out.print("Digite o título do filme: ");
	        String titulo = scanner.nextLine();

	        System.out.print("Digite o nome do diretor: ");
	        String diretor = scanner.nextLine();

	        System.out.print("Digite a duração do filme em minutos: ");
	        int duracao = scanner.nextInt();
	        scanner.nextLine(); // consumir quebra de linha

	        System.out.print("Digite o gênero do filme: ");
	        String genero = scanner.nextLine();

	        // Criando objeto Filme
	        Filme filme = new Filme(titulo, diretor, duracao, genero);

	        // Exibindo detalhes
	        System.out.println("\nDetalhes do filme:");
	        filme.exibirDetalhes();

	        // Verificando se é longo
	        if (filme.ehLongo()) {
	            System.out.println("Este é um filme longo.");
	        } else {
	            System.out.println("Este não é um filme longo.");
	        }

	        scanner.close();
	    }
	}
