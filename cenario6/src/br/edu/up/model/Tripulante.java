package br.edu.up.model;

public class Tripulante extends Pessoa {
    private String identificacaoAeronautica;
    private String matriculaFuncionario;

    public Tripulante(String nome, String rg, String aeronave, String identificacaoAeronautica, String matriculaFuncionario) {
        super(nome, rg, aeronave);
        this.identificacaoAeronautica = identificacaoAeronautica;
        this.matriculaFuncionario = matriculaFuncionario;
    }

    // Getters and setters
    public String getIdentificacaoAeronautica() { return identificacaoAeronautica; }
    public void setIdentificacaoAeronautica(String identificacaoAeronautica) { this.identificacaoAeronautica = identificacaoAeronautica; }
    public String getMatriculaFuncionario() { return matriculaFuncionario; }
    public void setMatriculaFuncionario(String matriculaFuncionario) { this.matriculaFuncionario = matriculaFuncionario; }
}
