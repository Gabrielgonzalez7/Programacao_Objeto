package pkg5;

public class Gerente extends Funcionario{
	 private double bonusAnual;

	    public Gerente(String nome, double salario, double bonusAnual) {
	        super(nome, salario);
	        this.bonusAnual = bonusAnual;
	    }

	    // Sobrecarga: aumento considerando bônus
	    public void aumentarSalario(double percentual, double adicionalBonus) {
	        salario += salario * ((percentual + adicionalBonus) / 100);
	    }

	    @Override
	    public String toString() {
	        return "Gerente: " + nome + " - Salário: R$" + String.format("%.2f", salario) +
	               " - Bônus Anual: R$" + String.format("%.2f", bonusAnual);
	    }
}
