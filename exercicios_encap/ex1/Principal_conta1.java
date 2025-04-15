import java.util.Scanner;

public class Principal_conta1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaBancaria conta = new ContaBancaria();

        System.out.print("Digite o saldo inicial: R$ ");
        double saldoInicial = scanner.nextDouble();
        conta.setSaldo(saldoInicial);

        System.out.print("Digite o limite da conta: R$ ");
        double limite = scanner.nextDouble();
        conta.setLimite(limite);

        System.out.print("Digite o valor do saque: R$ ");
        double valorSaque = scanner.nextDouble();

        conta.sacar(valorSaque);

        System.out.printf("Saldo atual: R$%.2f\n", conta.getSaldo());

        scanner.close();
    }
}