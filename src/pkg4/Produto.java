package pkg4;

public class Produto {
	private String nome;

	public Produto(String nome) {
		this.nome = nome;
	}
	public double calcularPrecoFinal(double preco) {
        System.out.println("Produto: " + nome + " - Preço final: R$" + String.format("%.2f", preco));
        return preco;
	}
	public double calcularPrecoFinal(double preco, Cliente cliente) {
        double desconto = preco * (cliente.getPercetualDesconto() / 100);
        double precoFinal = preco - desconto;
        System.out.println("Produto: " + nome + " - Cliente: " + cliente.getNome() +
                           " - Preço com desconto: R$" + String.format("%.2f", precoFinal));
        return precoFinal;
    }

}
