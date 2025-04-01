package Exemplo_1;

public class Aluno {
	private String nome_aluno;
	private int nota1;
	private int nota2;

	public void apresenta_Dados() {
		System.out.println("\n Nome: " + nome_aluno);

		System.out.println("\n Primeira nota: " + nota1);

		System.out.println("\n Segunda nota: " + nota2);
	}

	public Aluno(String nome_aluno, int nota1, int nota2) {
		this.nome_aluno = nome_aluno;
		this.nota1 = nota1 =7;
		this.nota2 = nota2=10;
	}

	public String getNome_aluno() {
		return nome_aluno;
	}

	public void setNome_aluno(String nome_aluno) {
		this.nome_aluno = nome_aluno;
	}

	public int getNota1() {
		return nota1;
	}

	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}

	public int getNota2() {
		return nota2;
	}

	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}
	
}
