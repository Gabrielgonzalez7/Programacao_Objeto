package pgk3;

public class Pessoa {
	protected String nome;
	protected int idade;
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	public void exibeDados() {
		System.out.printf("Nome: "+nome + "\n Idade:"  +idade);
	}
}
