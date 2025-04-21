import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Produto com valores via teclado
        System.out.println("Digite o nome do produto:");
        String nome = scanner.nextLine();

        System.out.println("Digite o preço do produto:");
        double preco = scanner.nextDouble();

        System.out.println("Digite a quantidade do produto:");
        int quantidade = scanner.nextInt();

        Produto produto1 = new Produto(nome, preco, quantidade);

        // Produto com valores definidos no código
        Produto produto2 = new Produto("Caderno", 15.90, 30);

        // Exibindo informações do produto 1
        System.out.println("\nProduto 1:");
        produto1.exibirInformacoes();
        System.out.println("Valor total em estoque: R$ " + produto1.calcularValorTotal());

        // Exibindo informações do produto 2
        System.out.println("\nProduto 2:");
        produto2.exibirInformacoes();
        System.out.println("Valor total em estoque: R$ " + produto2.calcularValorTotal());

        scanner.close();
    }
}