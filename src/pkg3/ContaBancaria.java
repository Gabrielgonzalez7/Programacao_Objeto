package pkg3;

public class ContaBancaria extends Cheque {
private String titular;
private double saldo;

public ContaBancaria(double valor, String bancoEmissor, String data, String titular, double saldo) {
	super(valor, bancoEmissor, data);
	this.setTitular(titular);
	this.saldo = saldo;
}

public void depositar(double valor) {
    if (valor > 0) {
        saldo += valor;
        System.out.println("Depósito de R$" + String.format("%.2f", valor) + " realizado. Novo saldo: R$" + String.format("%.2f", saldo));
    } else {
        System.out.println("Valor de depósito inválido.");
    }
}

public void depositar(Cheque cheque) {
    double valor = cheque.getValor();
    if (valor > 0) {
        saldo += valor;
        System.out.println("Depósito de cheque no valor de R$" + String.format("%.2f", valor) +
                           " do banco " + cheque.getBancoEmissor() +
                           " em " + cheque.getData() +
                           ". Novo saldo: R$" + String.format("%.2f", saldo));
    } else {
    	System.out.println("Valor do deposito inválido");
    }
    }

    public double getSaldo() {
        return saldo;
    }

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

}
