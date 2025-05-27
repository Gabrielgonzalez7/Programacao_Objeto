import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Estado> estados = new ArrayList<>();

        System.out.println("Quantos estados deseja cadastrar?");
        int qtdEstados = sc.nextInt();
        sc.nextLine(); // quebra de linha

        for (int i = 0; i < qtdEstados; i++) {
            System.out.println("Digite o nome do estado " + (i + 1) + ":");
            String nomeEstado = sc.nextLine();
            Estado estado = new Estado(nomeEstado);

            System.out.println("Quantos times deseja cadastrar para " + nomeEstado + "?");
            int qtdTimes = sc.nextInt();
            sc.nextLine(); //  quebra de linha

            for (int j = 0; j < qtdTimes; j++) {
                System.out.println("Digite o nome do time " + (j + 1) + " de " + nomeEstado + ":");
                String nomeTime = sc.nextLine();
                Time time = new Time(nomeTime);
                estado.adicionarTime(time);
            }

            estados.add(estado);
        }

        System.out.println("\nQuantidade de times por estado:");
        for (Estado estado : estados) {
            System.out.println(estado.getNome() + ": " + estado.getTimes().size() + " times");
        }

        while (true) {
            System.out.println("\nEscolha o número do estado para ver os times (ou 0 para sair):");
            for (int i = 0; i < estados.size(); i++) {
                System.out.println((i + 1) + ". " + estados.get(i).getNome());
            }
            System.out.println("0. Sair");

            int opcao = sc.nextInt();
            sc.nextLine(); // quebra de linha

            if (opcao == 0) {
                System.out.println("Saindo...");
                break;
            } else if (opcao > 0 && opcao <= estados.size()) {
                Estado estadoEscolhido = estados.get(opcao - 1);
                System.out.println("\nTimes do estado " + estadoEscolhido.getNome() + ":");
                for (Time time : estadoEscolhido.getTimes()) {
                    System.out.println("- " + time.getNome());
                }
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }

        sc.close();
    }
}
