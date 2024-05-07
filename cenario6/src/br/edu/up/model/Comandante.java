package br.edu.up.model;

public class Comandante extends Tripulante {
    private int totalHorasVoo;

    public Comandante(String nome, String rg, String aeronave, String identificacaoAeronautica, String matriculaFuncionario, int totalHorasVoo) {
        super(nome, rg, aeronave, identificacaoAeronautica, matriculaFuncionario);
        this.totalHorasVoo = totalHorasVoo;
    }

    // Getters and setters
    public int getTotalHorasVoo() { return totalHorasVoo; }
    public void setTotalHorasVoo(int totalHorasVoo) { this.totalHorasVoo = totalHorasVoo; }
}