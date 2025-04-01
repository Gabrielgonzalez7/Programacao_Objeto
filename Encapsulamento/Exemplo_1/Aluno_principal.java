package Exemplo_1;

public class Aluno_principal {

	public static void main(String[] args) {
		Aluno a = new Aluno("Gabriel", 7, 10);
		int media, nota1, nota2;
		nota1 = a.getNota1();
		nota2 = a.getNota2();
		media = (nota1 + nota2) / 2;
		System.out.println("\n A media do aluno é: " + media);
		a.apresenta_Dados();

	}

}
