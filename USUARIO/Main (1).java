import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando usuário com dados fixos
        Usuario usuario = new Usuario("admin", "1234");

        // Solicitando login
        System.out.print("Digite o nome de usuário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        // Tentando login
        if (usuario.login(nome, senha)) {
            System.out.println("Login bem-sucedido!");
        } else {
            System.out.println("Usuário ou senha incorretos.");
        }

        // Exibindo status
        usuario.exibirStatus();

        // Perguntando se quer fazer logout
        if (usuario.login(nome, senha)) {
            System.out.print("Deseja fazer logout? (s/n): ");
            String opcao = scanner.nextLine();
            if (opcao.equalsIgnoreCase("s")) {
                usuario.logout();
                System.out.println("Logout realizado.");
            }
            usuario.exibirStatus();
        }

        scanner.close();
    }
}