package br.edu.up.model;

public class Passagem {
    private String numeroAcento;
    private String classeAcento;
    private String dataVoo;

    public Passagem(String numeroAcento, String classeAcento, String dataVoo) {
        this.numeroAcento = numeroAcento;
        this.classeAcento = classeAcento;
        this.dataVoo = dataVoo;
    }

    // Getters and setters
    public String getNumeroAcento() { return numeroAcento; }
    public void setNumeroAcento(String numeroAcento) { this.numeroAcento = numeroAcento; }
    public String getClasseAcento() { return classeAcento; }
    public void setClasseAcento(String classeAcento) { this.classeAcento = classeAcento; }
    public String getDataVoo() { return dataVoo; }
    public void setDataVoo(String dataVoo) { this.dataVoo = dataVoo; }
}