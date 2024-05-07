package br.edu.up.model;

public class Comissario extends Tripulante {
    private String[] idiomas;

    public Comissario(String nome, String rg, String aeronave, String identificacaoAeronautica, String matriculaFuncionario, String[] idiomas) {
        super(nome, rg, aeronave, identificacaoAeronautica, matriculaFuncionario);
        this.idiomas = idiomas;
    }

    // Getters and setters
    public String[] getIdiomas() { return idiomas; }
    public void setIdiomas(String[] idiomas) { this.idiomas = idiomas; }
}