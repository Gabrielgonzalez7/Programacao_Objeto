import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aluno aluno1 = new Aluno("Matheus", 7.5);
		Aluno aluno2 = new Aluno("Andrisa", 8.8);
		Aluno aluno3 = new Aluno("Gabriel", 10);
		Aluno aluno4 = new Aluno("Leonardo", 5.35);
		Boletim boletim = new Boletim();

		boletim.imprimirStatus(aluno1);
		boletim.imprimirStatus(aluno2);
		boletim.imprimirStatus(aluno3);
		boletim.imprimirStatus(aluno4);

	
		System.out.print("Digite o nome do aluno: ");
		String nome = sc.nextLine();

		System.out.print("Digite a nota do aluno: ");
		double nota =  sc.nextDouble();
		Aluno aluno5 = new Aluno(nome, nota);
	
		boletim.imprimirStatus(aluno5);
            sc.close();
	}
}
