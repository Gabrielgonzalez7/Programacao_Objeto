import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//pessoa fisica
		System.out.println("Digite o nome da pessoa fisica");
		String nome_PF = sc.nextLine();

		System.out.println("Digite a cidade onde a compra foi efetuada: ");
		String cidade_PF = sc.nextLine();

		System.out.println("Digite o CPF do cliente: ");
		String cpf_PF = sc.nextLine();

		PessoaFisica pf = new PessoaFisica(nome_PF, cidade_PF, cpf_PF);
		System.out.print("Digite o valor da compra da pessoa fisica: ");
		double valorPF = sc.nextDouble();
		pf.efetuarCompra(valorPF);

		//PJ
     System.out.print("Digite o nome da pessoa jurídica: ");
        String nomePJ = sc.nextLine();

        System.out.print("Digite a cidade da pessoa jurídica: ");
        String cidadePJ = sc.nextLine();

        System.out.print("Digite o CNPJ da pessoa jurídica: ");
        String cnpj = sc.nextLine();

        PessoaJuridica pj = new PessoaJuridica(nomePJ, cidadePJ, cnpj);
     System.out.print("Digite o valor da compra da pessoa jurídica: ");
        double valorPJ = sc.nextDouble();
      pj.efetuarCompra(valorPJ);
      
      sc.close();
	}
}
