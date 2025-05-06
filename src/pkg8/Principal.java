package pkg8;
import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		 // Criando a lista de produtos
        List<Produto> listaDeProdutos = new ArrayList<>();

        // Adicionando produtos
        listaDeProdutos.add(new Produto("Notebook", 3500.00, 5));
        listaDeProdutos.add(new Produto("Mouse", 80.00, 20));
        listaDeProdutos.add(new Produto("Teclado", 150.00, 10));

        // Percorrendo e imprimindo
        System.out.println("Lista de Produtos:");
        for (Produto p : listaDeProdutos) {
            System.out.println(p);
        }
	}

}
