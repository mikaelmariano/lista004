package br.edu.up.view;

import br.edu.up.model.*;

import java.util.List;

public class DisciplinaView {
    public void printDetalhesDisciplina(String nomeDisciplina, String professor, List<Aluno> alunos) {
        System.out.println("Disciplina: " + nomeDisciplina);
        System.out.println("Professor: " + professor);
        for (Aluno aluno : alunos) {
            System.out.println("Aluno: " + aluno.getNome() + " - Matrícula: " + aluno.getMatricula());
        }
    }
}
