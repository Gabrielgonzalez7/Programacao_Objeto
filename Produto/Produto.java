import java.util.Scanner;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade; // Corrigido o nome da variável

    // Construtor
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Método para exibir informações
    void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade disponível: " + quantidade);
    }

    // Método para calcular o valor total
    double calcularValorTotal() {
        return preco * quantidade;
    }
}