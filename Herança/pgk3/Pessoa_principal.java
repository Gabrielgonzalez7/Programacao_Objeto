package pgk3;

import pkg4.PessoaJuridica;

public class Pessoa_principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p = new Pessoa("Gabriel", 25);
		p.exibeDados();
		System.out.println("\n	\n*********INFORMAÇÕES EMPRESA*************");
		PessoaJuridica pj = new PessoaJuridica("  Gabriel", 25, " 230599");
		pj.exibe_Dados_pj();
	
	}

}
