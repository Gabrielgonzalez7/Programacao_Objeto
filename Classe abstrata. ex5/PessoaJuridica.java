public class PessoaJuridica extends Pessoa{
    private String cnpj;
    
    public PessoaJuridica(String nome, String cidade, String cnpj){
        super(nome,  cidade);
        this.cnpj = cnpj;
    }
    @Override
    public void efetuarCompra(double valor){
        System.out.println("**** PARABÉNS, COMPRA EFEUTADA!!!!!****\n"
        + "Pessoa Juridica: " +nome+ ", de: " +cidade+ "\n"
        +"Efetuou uma compra no valor de R$: " +valor+ "\n"
        +"CNPJ: " +cnpj);
    }
    
}