package pkg2;

public class Gerente extends Funcionario {
	private double bonus;

	public Gerente(String nome, double salario, double bonus) {
		super(nome, salario);
		this.bonus = bonus;
	}
	@Override
    public void calcularSalario() {
        double salarioTotal = salario + bonus;
        System.out.println("Gerente: " + nome + " - Salário com bônus: R$" + String.format("%.2f", salarioTotal));

}
}
