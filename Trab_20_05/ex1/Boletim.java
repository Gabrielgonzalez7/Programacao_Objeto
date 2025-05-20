// Classe Boletim
public class Boletim {

    // Método que imprime o status do aluno
    public void imprimirStatus(Aluno a) {
        if (a.notaFinal >= 6.0) {
            System.out.println(a.nome + " foi APROVADO com nota " + a.notaFinal);
        } else {
            System.out.println(a.nome + " foi REPROVADO com nota " + a.notaFinal);
        }
    }
}
