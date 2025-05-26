import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Funcionario funcionario = null;
		
		System.out.println("Selecione o tipo de funcionario: ");
		System.out.println("1- Gerente");
		System.out.println("2- Vendedor");
		System.out.println("Opção: ");
		int opcao = sc.nextInt();
		sc.nextLine();
		
		
		System.out.println("Digite o nome do funcionário: ");
		String nome = sc.nextLine();
		
		System.out.println("Digite o salário do funcionário: ");
        double salario = sc.nextDouble();		
		
		
		System.out.println("Digite a identificação do funcionário: ");
		String identificacao = sc.nextLine();
		
		
		switch(opcao){
		    case 1: 
		        funcionario = new Gerente(nome, salario, identificacao);
		        break;
		    case 2:
		        funcionario = new Vendedor(nome, salario, identificacao);
		        break;
		   default:
		    System.out.println("Opção inválida!!");
		    sc.close();
		    return;
		}
		System.out.println("\n |||| INFORMAÇÕES DO FUNCIONÁRIO ||||");
		funcionario.mostrarInformacoes();
		
		System.out.println("\n ****CALCULAR SALÁRIO****");
		funcionario.calcularSalario();
		
		sc.close();
		
		
	}
}
