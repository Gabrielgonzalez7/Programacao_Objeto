import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int op;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 1 para criar uma pessoa e 2 para programador");
        op = sc.nextInt();
        Pessoa p;
        if(op==1){
            p = new Pessoa();
            p.trabalhar();
        }
        else if(op==2){
            p = new Programador();
            p.trabalhar();
        }
	}
}
