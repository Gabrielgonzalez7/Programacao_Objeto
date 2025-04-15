package pkg;

public class Carro_principal {

	public static void main(String[] args) {
		Carro c = new Carro();
		c.setNome("Corolla");
		//c.nome = "dsfsfsdf";
		c.exibeMsg();
		
		Onibus o = new Onibus();
		o.setNome("Planalto");
		o.setModelo("OF-2305");
		o.exibeMsg();
		
		System.out.println("O nome do onibus é: " +o.getNome());
		System.out.println("O modelo do onibus é: " +o.getModelo());
	}

}
