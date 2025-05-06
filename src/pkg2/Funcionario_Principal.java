package pkg2;

public class Funcionario_Principal {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Gabriel", 1000.0);
        funcionario.calcularSalario();

        Gerente gerente = new Gerente("Andrisa", 5000.0, 1500.0);
        gerente.calcularSalario();
    }

	}


