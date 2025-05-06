package pkg2;

public class Funcionario {
	protected String nome;
	protected double salario;
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public void calcularSalario() {
	System.out.println("Funcionário: " + nome + " -Salário: R$" + salario );	
	}
}
