package Aula_19_04;

public class Cachorro extends Animal {
public String raca;
@Override
public void emitirSom() {
	System.out.println("Au Au");
	System.out.println("O nome do cachorro é: " +nome);
	System.out.println("A raça do cachorro é: " +raca);
}
}
