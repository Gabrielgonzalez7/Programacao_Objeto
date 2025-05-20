public class Loja {

    public Produto criarProdutoDesconto(String nome, double preco) {
        double precoComDesconto = preco * 0.9; 
        return new Produto(nome, precoComDesconto);
    }
}
