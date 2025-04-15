import java.util.Scanner;
public class Carro_principal{
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro();

        System.out.print("Digite a marca do carro: ");
        String marca = scanner.nextLine();
        carro.setMarca(marca);

        System.out.print("Digite o modelo do carro: ");
        String modelo = scanner.nextLine();
        carro.setModelo(modelo);

        System.out.print("Digite o ano do carro: ");
        int ano = scanner.nextInt();
        carro.setAno(ano);

        System.out.println();
        carro.exibeDetalhes();

        scanner.close();
    }

}