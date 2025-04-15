import java.util.Scanner;

public class Ratangulo_principal{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.print("Digite o valor da base: ");
        double base = scanner.nextDouble();
        retangulo.setBase(base);

        System.out.print("Digite o valor da altura: ");
        double altura = scanner.nextDouble();
        retangulo.setAltura(altura);

        double area = retangulo.calcularArea();
        System.out.printf("A área do retângulo é: %.2f\n", area);

        scanner.close();
    }
}