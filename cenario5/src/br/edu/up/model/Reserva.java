package br.edu.up.model;

import java.time.LocalDate;

public class Reserva {
    private String nomeResponsavel;
    private int quantidadePessoas;
    private LocalDate dataReserva;
    private double valorTotal;

    public Reserva(String nomeResponsavel, int quantidadePessoas, LocalDate dataReserva, double valorTotal) {
        this.nomeResponsavel = nomeResponsavel;
        this.quantidadePessoas = quantidadePessoas;
        this.dataReserva = dataReserva;
        this.valorTotal = valorTotal;
    }

    // Getters and setters
    public String getNomeResponsavel() { return nomeResponsavel; }
    public void setNomeResponsavel(String nomeResponsavel) { this.nomeResponsavel = nomeResponsavel; }
    public int getQuantidadePessoas() { return quantidadePessoas; }
    public void setQuantidadePessoas(int quantidadePessoas) { this.quantidadePessoas = quantidadePessoas; }
    public LocalDate getDataReserva() { return dataReserva; }
    public void setDataReserva(LocalDate dataReserva) { this.dataReserva = dataReserva; }
    public double getValorTotal() { return valorTotal; }
    public void setValorTotal(double valorTotal) { this.valorTotal = valorTotal; }
}
