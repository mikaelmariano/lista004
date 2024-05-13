package br.edu.up.model;

public class SeguroVida extends Seguro {
    private boolean cobreDoenca;
    private boolean cobreAcidente;

    public SeguroVida(String apolice, Segurado segurado, double vlrApolice, LocalDate dtInicio, LocalDate dtFim, boolean cobreDoenca, boolean cobreAcidente) {
        super(apolice, segurado, vlrApolice, dtInicio, dtFim);
        this.cobreDoenca = cobreDoenca;
        this.cobreAcidente = cobreAcidente;
    }

    public boolean getCobreDoenca() {
        return cobreDoenca;
    }

    public void setCobreDoenca(boolean cobreDoenca) {
        this.cobreDoenca = cobreDoenca;
    }

    public boolean getCobreAcidente() {
        return cobreAcidente;
    }

    public void setCobreAcidente(boolean cobreAcidente) {
        this.cobreAcidente = cobreAcidente;
    }

    @Override
    public String getDados() {
        return "SeguroVida{" +
               "cobreDoenca=" + cobreDoenca +
               ", cobreAcidente=" + cobreAcidente +
               '}';
    }

    @Override
    public String toString() {
        return super.toString() + ", " + getDados();
    }
}
