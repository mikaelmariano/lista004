package br.edu.up.controller;

import br.edu.up.model.*;

public class DisciplinaController {
    private Disciplina disciplina;

    public DisciplinaController(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    // Método para adicionar um aluno à disciplina
    public void adicionarAluno(Aluno aluno) {
        disciplina.addAluno(aluno);
    }

    // Método para avaliar todos os alunos na disciplina
    public void avaliarAlunos() {
        disciplina.avaliarAlunos();
    }

    // Método para obter informações da disciplina
    public String getInfoDisciplina() {
        return "Disciplina: " + disciplina.getNome() + "\n" +
               "Identificador: " + disciplina.getIdentificador() + "\n" +
               "Professor: " + disciplina.getProfessor().getNome();
    }

    // Método para listar alunos matriculados na disciplina
    public String listarAlunos() {
        StringBuilder sb = new StringBuilder();
        sb.append("Lista de Alunos:\n");
        for (Aluno aluno : disciplina.getAlunos()) {
            sb.append(aluno.getNome()).append(" - ").append(aluno.getMatricula()).append("\n");
        }
        return sb.toString();
    }

    // Método para listar o currículo da disciplina
    public String listarCurriculo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Currículo da Disciplina:\n");
        for (String curso : disciplina.getCurriculo()) {
            sb.append(curso).append("\n");
        }
        return sb.toString();
    }
}
