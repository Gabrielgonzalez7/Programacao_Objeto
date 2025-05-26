import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.println("Escolha uma operação: ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        int opcao = sc.nextInt();

        System.out.println("Usar quantos números? (2 ou 3): ");
        int quantidade = sc.nextInt();

        if (quantidade == 2) {
            System.out.print("Digite o primeiro número: ");
            double a = sc.nextDouble();
            System.out.print("Digite o segundo número: ");
            double b = sc.nextDouble();

            switch (opcao) {
                case 1:
                    System.out.println("Resultado: " + calc.somar((int) a, (int) b));
                    break;
                case 2:
                    System.out.println("Resultado: " + calc.subtrair((int) a, (int) b));
                    break;
                case 3:
                    System.out.println("Resultado: " + calc.multiplicar((int) a, (int) b));
                    break;
                case 4:
                    System.out.println("Resultado: " + calc.dividir(a, b));
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } else if (quantidade == 3) {
            System.out.print("Digite o primeiro número: ");
            double a = sc.nextDouble();
            System.out.print("Digite o segundo número: ");
            double b = sc.nextDouble();
            System.out.print("Digite o terceiro número: ");
            double c = sc.nextDouble();

            switch (opcao) {
                case 1:
                    System.out.println("Resultado: " + calc.somar((int) a, (int) b, (int) c));
                    break;
                case 2:
                    System.out.println("Resultado: " + calc.subtrair((int) a, (int) b, (int) c));
                    break;
                case 3:
                    System.out.println("Resultado: " + calc.multiplicar((int) a, (int) b, (int) c));
                    break;
                case 4:
                    System.out.println("Resultado: " + calc.dividir(a, b, c));
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } else {
            System.out.println("Quantidade inválida.");
        }

        sc.close();
    }
}