public class Produto {
    String nome;
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void exibirProduto() {
        System.out.println("Produto: " + nome + " | Preço: R$ " + preco);
    }
}