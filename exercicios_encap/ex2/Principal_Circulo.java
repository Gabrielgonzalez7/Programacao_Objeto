import java.util.Scanner;

public class Principal_Circulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circulo circulo = new Circulo();

        System.out.print("Digite o valor do raio do círculo: ");
        double raio = scanner.nextDouble();
        circulo.setRaio(raio);

        double area = circulo.calculaArea();
        System.out.printf("A área do círculo é: %.2f\n", area);

        scanner.close();
    }
}
