package br.edu.up.model;

public class Professor extends Pessoa {
    private String numeroLattes;
    private Titulacao titulacao;

    public Professor(String nome, String rg, String matricula, String numeroLattes, Titulacao titulacao) {
        super(nome, rg, matricula);
        this.numeroLattes = numeroLattes;
        this.titulacao = titulacao;
    }

    // Getters
    public String getNumeroLattes() {
        return numeroLattes;
    }

    public Titulacao getTitulacao() {
        return titulacao;
    }
}