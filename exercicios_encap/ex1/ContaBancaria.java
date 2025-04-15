import java.util.Scanner;

public class ContaBancaria {
    // Atributos privados (encapsulamento)
    private double saldo;
    private double limite;

    // Construtor
    public ContaBancaria() {
        this.saldo = 0.0;
        this.limite = 0.0;
    }

    // Getters
    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    // Setters
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    // Método de saque
    public void sacar(double valor) {
        if (valor <= saldo + limite) {
            saldo -= valor;
            System.out.printf("Saque de R$%.2f realizado com sucesso!\n", valor);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        
        }
    }
}