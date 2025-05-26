public class PessoaFisica extends Pessoa{
    private String cpf;
    
    public PessoaFisica(String nome, String cidade, String cpf){
    super(nome, cidade);
    this.cpf = cpf;
    }
    @Override
    public void efetuarCompra(double valor){
        System.out.println("**** PARABÉNS, COMPRA EFEUTADA!!!!!**** \n"
        +"Pessoa Física: " +nome+ " de " +cidade+ "\n "
        +"Efetuou uma compra no valor de RS: " +valor+ "\n"
        + "CPF: " +cpf);
    }
}