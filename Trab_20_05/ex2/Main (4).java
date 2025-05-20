import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Loja loja = new Loja();

		Produto produtoOriginal = new Produto("Camiseta", 100.00);
		Produto produtoComDesconto = loja.criarProdutoDesconto("Camiseta", 100.00);

		System.out.println("Produto sem desconto:");
		produtoOriginal.exibirProduto();

		System.out.println("Produto com 10% de desconto:");
		produtoComDesconto.exibirProduto();

		//DIGITADO PELO USUARIO:

		System.out.println("\n Digite o produto: ");
		String nome = sc.nextLine();

		System.out.println("\n Digite o preC'o do produto: "   + "R$");
		double preco = sc.nextDouble();
		Produto produtoOriginal2 = new Produto(nome, preco);
		Produto produtoComDesconto2 = loja.criarProdutoDesconto(nome, preco);

		System.out.println("\nProduto digitado sem desconto:");
		produtoOriginal2.exibirProduto();

		System.out.println("Produto digitado com 10% de desconto:");
		produtoComDesconto2.exibirProduto();

		sc.close();
	}
}