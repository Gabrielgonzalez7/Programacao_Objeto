package pgk9;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		 // Criando lista de alunos
        List<Aluno> alunos = new ArrayList<>();

        // Adicionando alunos
        alunos.add(new Aluno("Gabriel", 7.5, 8.0));
        alunos.add(new Aluno("Matheus", 5.0, 4.5));
        alunos.add(new Aluno("Andrisa", 6.0, 6.5));

        // Percorrendo a lista e verificando aprovação
        for (Aluno aluno : alunos) {
            double media = aluno.calcularMedia();
            System.out.printf("Aluno: %s - Média: %.2f - ", aluno.getNome(), media);
            if (media >= 6.0) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
        }
    }

	}

