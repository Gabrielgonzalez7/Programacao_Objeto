public class Vendedor extends Funcionario{
    public Vendedor(String nome, double salario, String identificacao){
        super(nome, salario, identificacao);
    }
    public void calcularSalario(){
        double salarioFinal = salario * 1.1;
        System.out.println("Salário final do Vendedor: R$ " +String.format("%.2f", salarioFinal));
    }
}