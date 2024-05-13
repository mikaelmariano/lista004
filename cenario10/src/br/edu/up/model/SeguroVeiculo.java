package br.edu.up.model;

public class SeguroVeiculo extends Seguro {
    private double vlrFranquia;
    private boolean temCarroReserva;
    private boolean cobreVidros;

    public SeguroVeiculo(String apolice, Segurado segurado, double vlrApolice, LocalDate dtInicio, LocalDate dtFim, double vlrFranquia, boolean temCarroReserva, boolean cobreVidros) {
        super(apolice, segurado, vlrApolice, dtInicio, dtFim);
        this.vlrFranquia = vlrFranquia;
        this.temCarroReserva = temCarroReserva;
        this.cobreVidros = cobreVidros;
    }

    public double getVlrFranquia() {
        return vlrFranquia;
    }

    public void setVlrFranquia(double vlrFranquia) {
        this.vlrFranquia = vlrFranquia;
    }

    public boolean getTemCarroReserva() {
        return temCarroReserva;
    }

    public void setTemCarroReserva(boolean temCarroReserva) {
        this.temCarroReserva = temCarroReserva;
    }

    public boolean getCobreVidros() {
        return cobreVidros;
    }

    public void setCobreVidros(boolean cobreVidros) {
        this.cobreVidros = cobreVidros;
    }

    @Override
    public String getDados() {
        return "SeguroVeiculo{" +
               "vlrFranquia=" + vlrFranquia +
               ", temCarroReserva=" + temCarroReserva +
               ", cobreVidros=" + cobreVidros +
               '}';
    }

    @Override
    public String toString() {
        return super.toString() + ", " + getDados();
    }
}
