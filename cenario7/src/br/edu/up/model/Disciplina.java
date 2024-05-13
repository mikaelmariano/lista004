package br.edu.up.model;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private String identificador;
    private List<String> curriculo;
    private HashMap<String, Boolean> competenciasNecessarias;
    private HashMap<String, Boolean> competenciasComplementares;
    private Professor professor;
    private List<Aluno> alunos;

    // Construtor
    public Disciplina(String nome, String identificador, List<String> curriculo,
                      HashMap<String, Boolean> competenciasNecessarias,
                      HashMap<String, Boolean> competenciasComplementares,
                      Professor professor) {
        this.nome = nome;
        this.identificador = identificador;
        this.curriculo = curriculo;
        this.competenciasNecessarias = competenciasNecessarias;
        this.competenciasComplementares = competenciasComplementares;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    // Adicionar um aluno à disciplina
    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    // Avaliar alunos
    public void avaliarAlunos() {
        for (Aluno aluno : alunos) {
            HashMap<String, Boolean> competenciasAluno = aluno.getCompetencias();
            int totalNecessarias = competenciasNecessarias.size();
            int atingidasNecessarias = 0;
            int totalComplementares = competenciasComplementares.size();
            int atingidasComplementares = 0;

            // Calcular competências necessárias
            for (String key : competenciasNecessarias.keySet()) {
                if (competenciasAluno.getOrDefault(key, false)) {
                    atingidasNecessarias++;
                }
            }

            // Calcular competências complementares
            for (String key : competenciasComplementares.keySet()) {
                if (competenciasAluno.getOrDefault(key, false)) {
                    atingidasComplementares++;
                }
            }

            // Determinar o status do aluno
            if (atingidasNecessarias == totalNecessarias && atingidasComplementares >= totalComplementares / 2) {
                System.out.println(aluno.getNome() + " está Aprovado.");
            } else if (atingidasNecessarias < totalNecessarias / 2 || atingidasComplementares < totalComplementares / 2) {
                System.out.println(aluno.getNome() + " está Reprovado.");
            } else {
                System.out.println(aluno.getNome() + " está Pendente.");
            }
        }
    }

    // Getters para propriedades da disciplina
    public String getNome() {
        return nome;
    }

    public String getIdentificador() {
        return identificador;
    }

    public List<String> getCurriculo() {
        return new ArrayList<>(curriculo);
    }

    public Professor getProfessor() {
        return professor;
    }

    public List<Aluno> getAlunos() {
        return new ArrayList<>(alunos);
    }
}
