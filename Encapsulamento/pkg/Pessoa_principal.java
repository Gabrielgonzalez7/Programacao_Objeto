package pkg;

public class Pessoa_principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p = new Pessoa("Gabriel ", 26, "03046");

		p.apresentaDados();
		int idade, ano;

		idade = p.getIdade();
		ano = 2025 - 18;
		System.out.println("\n O ano de nascimento é: " + ano);
		p.setIdade(-35);
		p.apresentaDados();
		p.setNome("Leonardo");
		p.setNome(p.getNome() + " Gonzalez");
		p.apresentaDados();
	}

}
