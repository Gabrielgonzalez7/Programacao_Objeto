package pkg4;

import pgk3.Pessoa;

public class PessoaJuridica extends Pessoa {
	public PessoaJuridica(String nome, int idade, String cnpj) {
		super(nome, idade);
		this.cnpj = cnpj;
		// TODO Auto-generated constructor stub
	}
	protected String cnpj;
	protected String socio;
	protected String dtAbertura;
	 
	public void exibe_Dados_pj() {
	System.out.println("\n Nome: " +nome + "\n Idade: " +idade + "\n CNPJ: " +cnpj);
	}
		
	}

	
	
	
	
	


