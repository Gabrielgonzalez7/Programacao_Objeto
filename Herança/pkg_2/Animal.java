package pkg_2;

public class Animal {
	protected String nome;
	protected int idade;
	protected String som;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	public void exibir_dados() {
		System.out.println("O nome do cachorro é: ");
	}
}
