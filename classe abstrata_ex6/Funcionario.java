public abstract class Funcionario{
    protected String nome;
    protected double salario;
    protected String identificacao;
    
    public Funcionario(String nome, double salario, String identificacao){
        this.nome = nome;
        this.salario = salario;
        this.identificacao = identificacao;
    }
    
    public abstract void calcularSalario();
    
    public void mostrarInformacoes(){
        System.out.println("Nome do Funcionario: " +nome);
        System.out.println("Salário R$: " +String.format("%.2f", salario));
        System.out.println("identificacao do Funcionario: " +identificacao);
    }
}