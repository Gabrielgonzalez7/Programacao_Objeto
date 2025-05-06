package pkg3;

public class Conta_Principal {

	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria(0, "Carlos", null, null, 0);

        conta.depositar(500.0);  

        Cheque cheque = new Cheque(300.0, "Banco XYZ", "06/05/2025");
        conta.depositar(cheque);  

	}

}
