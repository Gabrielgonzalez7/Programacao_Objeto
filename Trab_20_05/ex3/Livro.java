public class Livro {
	String autor;
	String titulo;
	public Livro(String autor, String titulo) {
		this.autor = autor;
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void exibirLivro() {
		System.out.println("Titulo: " +titulo+  " ||| Autor: " +autor);
	}
}