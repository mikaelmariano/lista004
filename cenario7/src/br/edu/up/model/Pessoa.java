package br.edu.up.model;

public abstract class Pessoa {
    protected String nome;
    protected String rg;
    protected String matricula;

    public Pessoa(String nome, String rg, String matricula) {
        this.nome = nome;
        this.rg = rg;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getRg() {
        return rg;
    }

    public String getMatricula() {
        return matricula;
    }
}
