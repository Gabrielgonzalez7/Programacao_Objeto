package pkg4;

public class Produto_principal {

	public static void main(String[] args) {
		Produto produto = new Produto("Notebook");

        double precoOriginal = 3000.0;
        produto.calcularPrecoFinal(precoOriginal);  

        Cliente cliente = new Cliente("Gabriel", 50.0); 
        produto.calcularPrecoFinal(precoOriginal, cliente);  
    }
	}


