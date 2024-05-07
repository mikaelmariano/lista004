package br.edu.up.model;

public class Passageiro extends Pessoa {
    private String identificadorBagagem;
    private String passagem;

    public Passageiro(String nome, String rg, String aeronave, String identificadorBagagem, String passagem) {
        super(nome, rg, aeronave);
        this.identificadorBagagem = identificadorBagagem;
        this.passagem = passagem;
    }

    // Getters and setters
    public String getIdentificadorBagagem() { return identificadorBagagem; }
    public void setIdentificadorBagagem(String identificadorBagagem) { this.identificadorBagagem = identificadorBagagem; }
    public String getPassagem() { return passagem; }
    public void setPassagem(String passagem) { this.passagem = passagem; }
}
