package pkg10;
import java.util.ArrayList;
import java.util.List;
public class Principal {

	public static void main(String[] args) {
		 List<Pessoa> pessoas = new ArrayList<>();

	        // Adicionando pessoas à lista
	        pessoas.add(new Pessoa("Gabriel", 25, "M"));
	        pessoas.add(new Pessoa("Andrisa", 20, "F"));
	        pessoas.add(new Pessoa("Joselaine", 47, "F"));
	        pessoas.add(new Pessoa("Alexandre", 50, "M"));
	        pessoas.add(new Pessoa("Leonardo", 18, "M"));

	        // Chamando o método e imprimindo o resultado
	        int quantidadeMulheres = contarMulheres(pessoas);
	        System.out.println("Quantidade de mulheres: " + quantidadeMulheres);
	    }

	    public static int contarMulheres(List<Pessoa> lista) {
	        int contador = 0;
	        for (Pessoa p : lista) {
	            if (p.getSexo().equalsIgnoreCase("F")) {
	                contador++;
	            }
	        }
	        return contador;
	    }	
	}


