public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta("Gabriel", 1000.00);
        Conta conta2 = new Conta("Leonardo", 500.00);
        Conta conta3 = new Conta("Matheus" , 800.00);

        System.out.println("Antes da transferência:");
        conta1.exibirConta();
        conta2.exibirConta();
        conta3.exibirConta();
        
        conta1.transferir(conta2, 100.00);
        conta3.transferir(conta3, 150.00);

        System.out.println("\nDepois da transferência:");
        conta1.exibirConta();
        conta2.exibirConta();
        conta3.exibirConta();
    }
}
