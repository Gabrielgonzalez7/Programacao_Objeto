package pkg5;

public class Desenvolvedor extends Funcionario {
	private int horasExtras;
    private double valorHoraExtra;

    public Desenvolvedor(String nome, double salario, int horasExtras, double valorHoraExtra) {
        super(nome, salario);
        this.horasExtras = horasExtras;
        this.valorHoraExtra = valorHoraExtra;
    }

    public void calcularHorasExtras() {
        salario += horasExtras * valorHoraExtra;
    }

    @Override
    public String toString() {
        return "Desenvolvedor: " + nome + " - Salário: R$" + String.format("%.2f", salario) +
               " - Horas Extras: " + horasExtras;
    }
}
