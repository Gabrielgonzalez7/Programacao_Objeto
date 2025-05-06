package pkg3;

public class Cheque {
	
protected double valor;
private String bancoEmissor;
protected String data;
public Cheque(double valor, String bancoEmissor, String data) {
	this.valor = valor;
	this.bancoEmissor = bancoEmissor;
	this.data = data;
}
public double getValor() {
	return valor;
}
public String getBancoEmissor() {
	return bancoEmissor;
}
public String getData() {
	return data;
}
}
