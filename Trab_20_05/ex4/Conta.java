public class Conta {
    private String titular;
    private double saldo;

    public Conta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // transferir valor para outra conta
    public void transferir(Conta destino, double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            destino.saldo += valor;
            System.out.printf("Transferência de R$%.2f de %s para %s realizada com sucesso.\n",
                              valor, this.titular, destino.titular);
        } else {
            System.out.println("Transferência inválida: saldo insuficiente ou valor inválido.");
        }
    }

    public void exibirConta() {
        System.out.printf("Titular: %s | Saldo: R$%.2f\n", titular, saldo);
    }

    
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
}
