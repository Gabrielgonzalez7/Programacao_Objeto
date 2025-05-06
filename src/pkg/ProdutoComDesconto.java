package pkg;

public class ProdutoComDesconto extends Produto{
	private double percentualDesconto;

	public ProdutoComDesconto(String nome, double preco, double percentualDesconto) {
		super(nome, preco);
		this.percentualDesconto = percentualDesconto;
	}
	
	@Override
    public void desconto() {
        double precoComDesconto = preco * (1 - percentualDesconto / 100);
        System.out.println("Produto: " + nome + " - Preço com desconto: R$" + String.format("%.2f", precoComDesconto));
    }
	
	
}
