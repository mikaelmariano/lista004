package br.edu.up.model;

import java.time.LocalDate;

public abstract class Seguro {
    private String apolice;
    private Segurado segurado;
    private double vlrApolice;
    private LocalDate dtInicio;
    private LocalDate dtFim;

    public Seguro(String apolice, Segurado segurado, double vlrApolice, LocalDate dtInicio, LocalDate dtFim) {
        this.apolice = apolice;
        this.segurado = segurado;
        this.vlrApolice = vlrApolice;
        this.dtInicio = dtInicio;
        this.dtFim = dtFim;
    }

    public String getApolice() {
        return apolice;
    }

    public void setApolice(String apolice) {
        this.apolice = apolice;
    }

    public Segurado getSegurado() {
        return segurado;
    }

    public void setSegurado(Segurado segurado) {
        this.segurado = segurado;
    }

    public double getVlrApolice() {
        return vlrApolice;
    }

    public void setVlrApolice(double vlrApolice) {
        this.vlrApolice = vlrApolice;
    }

    public LocalDate getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(LocalDate dtInicio) {
        this.dtInicio = dtInicio;
    }

    public LocalDate getDtFim() {
        return dtFim;
    }

    public void setDtFim(LocalDate dtFim) {
        this.dtFim = dtFim;
    }

    public abstract String getDados();

    @Override
    public String toString() {
        return "Seguro{" +
               "apolice='" + apolice + '\'' +
               ", segurado=" + segurado.toString() +
               ", vlrApolice=" + vlrApolice +
               ", dtInicio=" + dtInicio +
               ", dtFim=" + dtFim +
               '}';
    }
}
