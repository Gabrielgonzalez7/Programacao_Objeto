public abstract class Pessoa {
	protected String nome;
	protected String cidade;
	protected double valorCompra;

	public Pessoa(String nome, String cidade) {
		this.nome = nome;
		this.cidade = cidade;
	}

	public void efetuarCompra(double valor) {
		this.valorCompra = valor;
		System.out.println("**** PARABÉNS, COMPRA EFETUADA!!!!! ****");
	}
	public abstract void mostrarInformacoes();
}