package ex2;

public class Calculadora_principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calc = new Calculadora();
		int resultado1 = calc.somar(7, 5);
		int resultado2 = calc.somar(3, 5,7);
		System.out.println("Resultado 1: " +resultado1);
		System.out.println("Resultado 2: " +resultado2);
		double resultado3 = calc.somar(3, 7);
		System.out.println("Resultado 3: " +resultado3);
		double resultado4 = calc.multi(3,2);
		System.out.println("O resultado 4 é: " +resultado4);
	}

}
