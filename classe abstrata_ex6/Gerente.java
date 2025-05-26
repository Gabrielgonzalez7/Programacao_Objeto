public class Gerente extends Funcionario{
    public Gerente(String nome, double salario, String identificacao){
        super(nome, salario, identificacao);
    }
    @Override
    //20% de bônus
    public void calcularSalario(){
    double salarioFinal = salario *1.2;
    System.out.println("Salário final do Gerente: R$ " +String.format("%.2f", salarioFinal));
}
}