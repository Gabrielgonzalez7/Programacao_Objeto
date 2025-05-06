package pkg4;

public class Cliente {
	private String nome;
	private double percetualDesconto;
	public Cliente(String nome, double percetualDesconto) {
		this.nome = nome;
		this.percetualDesconto = percetualDesconto;
	}
	public String getNome() {
		return nome;
	}

	
	public double getPercetualDesconto() {
		return percetualDesconto;
	}
}
