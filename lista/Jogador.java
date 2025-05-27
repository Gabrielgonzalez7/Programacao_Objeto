public class Jogador {
	private String nome;
	private double notaFinal;
	public Jogador(String nome, double notaFinal) {
		this.nome = nome;
		this.notaFinal = notaFinal;
	}
	public String getNome() {
        return nome;
    }

    public double getNotaFinal() {
        return notaFinal;
    }
	
}
