import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //carro
        System.out.println("Digite a marca do carro: ");
        String marcaCarro = sc.nextLine();
        
        System.out.println("Digite o modelo do carro: ");
        String modeloCarro = sc.nextLine();
        
        System.out.println("Digite o ano do carro: ");
        int anoCarro = sc.nextInt();
        sc.nextLine();
        Carro carro = new Carro(marcaCarro, modeloCarro, anoCarro);
        
        carro.acelerar();
        carro.frear();

        //moto
        
        System.out.println("Digite a marca do moto: ");
        String marcaMoto = sc.nextLine();
        
        System.out.println("Digite o modelo da moto: ");
        String modeloMoto = sc.nextLine();
        
        System.out.println("Digite o ano da moto: ");
        int anoMoto = sc.nextInt();
        
        Moto moto= new Moto(marcaMoto, modeloMoto, anoMoto);
        
        

        moto.acelerar();
        moto.frear();
        
        sc.close();
    }
}
