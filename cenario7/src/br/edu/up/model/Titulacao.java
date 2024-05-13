package br.edu.up.model;

public class Titulacao {
    private String nomeInstituicao;
    private int anoConclusao;
    private String nomeTitulo;
    private String tituloTrabalho;

    public Titulacao(String nomeInstituicao, int anoConclusao, String nomeTitulo, String tituloTrabalho) {
        this.nomeInstituicao = nomeInstituicao;
        this.anoConclusao = anoConclusao;
        this.nomeTitulo = nomeTitulo;
        this.tituloTrabalho = tituloTrabalho;
    }

    // Getters
    public String getNomeInstituicao() {
        return nomeInstituicao;
    }

    public int getAnoConclusao() {
        return anoConclusao;
    }

    public String getNomeTitulo() {
        return nomeTitulo;
    }

    public String getTituloTrabalho() {
        return tituloTrabalho;
    }
}