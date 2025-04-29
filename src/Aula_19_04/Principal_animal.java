package Aula_19_04;

public class Principal_animal {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.nome = "Animal 1";
		a.emitirSom();
		
		Cachorro c = new Cachorro();
		c.nome = "Junim";
		c.raca = "Shih-tzu";
		c.emitirSom();
				
		Passarinho p = new Passarinho();
		p.emitirSom();
		
	}

}
