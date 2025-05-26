import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    
    Pessoa pessoa = null;
    
    System.out.println("Selecione o tipo de pessso: ");
    System.out.println("1- Pessoa Física: ");
    System.out.println("2- Pessoa Jurídica: ");
    System.out.println("Opção: ");
    int opcao = sc.nextInt();
    sc.nextLine();
    
    System.out.println("Digite o nome: ");
    String nome = sc.nextLine();
    
    System.out.println("Digite a cidade: ");
    String cidade = sc.nextLine();
    
    if(opcao == 1){
        System.out.println("Digite o CPF: ");
        String cpf = sc.nextLine();
        
        pessoa = new PessoaFisica(nome, cidade, cpf);
    } else if(opcao == 2){
        System.out.println("Digite o CNPJ: ");
        String cnpj = sc.nextLine();
        
        pessoa = new PessoaJuridica(nome, cidade, cnpj);
    } else{
        System.out.println("OPÇÃO INVÁLIDA!!!!");
        sc.close();
        return;
    }
    System.out.println("Digite o valor da compra: ");
    double valor = sc.nextDouble();
    
    pessoa.efetuarCompra(valor);
    pessoa.mostrarInformacoes();
    
    sc.close();
	 
	    
	}
}
