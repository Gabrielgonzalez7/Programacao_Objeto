public class Filme {
	public String titulo;
	public String diretor;
	public int duracaoEmMinutos;
	public String genero;
	public Filme(String titulo, String diretor, int duracaoEmMinutos, String genero) {
		this.titulo = titulo;
		this.diretor = diretor;
		this.duracaoEmMinutos = duracaoEmMinutos;
		this.genero = genero;
	}
	public void exibirDetalhes() {
		System.out.println("Titulo: " +titulo);
		System.out.println("Diretor: " +diretor);
		System.out.println("Duração: " +duracaoEmMinutos + " minutos");
		System.out.println("GÊnero: " +genero);
	}
	public boolean ehLongo() {
        return duracaoEmMinutos > 120;
    }
}
