package classes;

public class Quadrado extends Desenho2d {

	public Quadrado(int largura, int altura) {
		super(largura, altura);
		// TODO Auto-generated constructor stub
	}
	protected String desc;
	public Quadrado(int largura, int altura, String desc) {
		super(largura, altura);
		this.desc = desc;
	}
	public void ExibeDados(){
		System.out.println("Nome Autor: " +this.nomeAutor);
		System.out.println("Largura: " +this.largura);
		System.out.println("Altura: " +this.altura);
		System.out.println("Descrição: " +this.desc);
	
	
	}

}
