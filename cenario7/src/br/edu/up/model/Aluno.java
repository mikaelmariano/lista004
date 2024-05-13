package br.edu.up.model;

import java.util.HashMap;

public class Aluno {
    private String nome;
    private String rg;
    private String matricula;
    private String curso;
    private int anoIngresso;
    private String turno;
    private HashMap<String, Boolean> competencias; // Para armazenar as competências atingidas pelo aluno

    // Construtor
    public Aluno(String nome, String rg, String matricula, String curso, int anoIngresso, String turno) {
        this.nome = nome;
        this.rg = rg;
        this.matricula = matricula;
        this.curso = curso;
        this.anoIngresso = anoIngresso;
        this.turno = turno;
        this.competencias = new HashMap<>();
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getRg() {
        return rg;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public String getTurno() {
        return turno;
    }

    public HashMap<String, Boolean> getCompetencias() {
        return new HashMap<>(competencias);
    }

    // Método para adicionar ou atualizar uma competência
    public void setCompetencia(String competencia, boolean atingida) {
        competencias.put(competencia, atingida);
    }

    // Método para verificar se uma competência específica foi atingida
    public boolean isCompetenciaAtingida(String competencia) {
        return competencias.getOrDefault(competencia, false);
    }
}
