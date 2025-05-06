package pkg5;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Funcionario[] funcionarios = new Funcionario[3];

	        funcionarios[0] = new Gerente("Andrisa", 8000.0, 5000.0);
	        funcionarios[1] = new Desenvolvedor("Gabriel", 4000.0, 10, 50.0);
	        funcionarios[2] = new Funcionario("João", 3000.0);

	        // Aplicando aumentos e cálculos específicos
	        for (Funcionario f : funcionarios) {
	            if (f instanceof Gerente) {
	                ((Gerente) f).aumentarSalario(5.0, 3.0); // aumento com bônus
	            } else if (f instanceof Desenvolvedor) {
	                ((Desenvolvedor) f).calcularHorasExtras(); // cálculo de horas extras
	                f.aumentarSalario(5.0); // aumento base
	            } else {
	                f.aumentarSalario(5.0); // aumento padrão
	            }
	        }

	        // Impressão das informações
	        for (Funcionario f : funcionarios) {
	            System.out.println(f);
	        }
	    }
	}


