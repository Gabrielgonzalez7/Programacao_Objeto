package pkg;

public class Produto_principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto produto1 = new Produto("Camiseta", 100.0);
        produto1.desconto();

        Produto produto2 = new ProdutoComDesconto("Moletom", 300.0, 20.0);
        produto2.desconto();
    }
	}


