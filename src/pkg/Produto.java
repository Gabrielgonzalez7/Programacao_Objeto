package pkg;

public class Produto {
	protected String nome;
	protected double preco;
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public void desconto() {
        System.out.println("Produto: " + nome + " - Preço: R$" + String.format("%.2f", preco));
    }
	
}
