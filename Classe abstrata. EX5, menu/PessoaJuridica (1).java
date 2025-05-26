public class PessoaJuridica extends Pessoa{
    private String cnpj;
    
    public PessoaJuridica(String nome, String cidade, String cnpj){
        super(nome,  cidade);
        this.cnpj = cnpj;
    }
    @Override
    public void mostrarInformacoes(){
    System.out.println("|||| INFORMAÇÕES DA PESSOA JURÍDICA ||||");
        System.out.println("Nome: " + nome+ ", de: "+cidade);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Valor da compra: R$ " + String.format("%.2f", valorCompra));
    }
    
}