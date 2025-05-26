public class PessoaFisica extends Pessoa{
    private String cpf;
    
    public PessoaFisica(String nome, String cidade, String cpf){
    super(nome, cidade);
    this.cpf = cpf;
    }
    @Override
    public void mostrarInformacoes(){
         System.out.println("|||| INFORMAÇÕES DA PESSOA FÍSICA ||||");
        System.out.println("Nome: " + nome+ ", de: "+cidade);
        System.out.println("CPF: " + cpf);
        System.out.println("Valor da compra: R$ " + String.format("%.2f", valorCompra));
    }
}