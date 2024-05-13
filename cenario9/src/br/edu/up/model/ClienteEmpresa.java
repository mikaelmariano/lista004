package br.edu.up.model;

public class ClienteEmpresa extends Cliente {
    private String CNPJ;
    private String inscEstadual;
    private int anoFundacao;

    public ClienteEmpresa(String nome, String telefone, String email, Endereco endereco, String CNPJ, String inscEstadual, int anoFundacao) {
        super(nome, telefone, email, endereco, 25000.0); // Máximo de crédito fixado em R$25.000,00
        this.CNPJ = CNPJ;
        this.inscEstadual = inscEstadual;
        this.anoFundacao = anoFundacao;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getInscEstadual() {
        return inscEstadual;
    }

    public void setInscEstadual(String inscEstadual) {
        this.inscEstadual = inscEstadual;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    public String getDados() {
        return "ClienteEmpresa{" +
               "CNPJ='" + CNPJ + '\'' +
               ", inscEstadual='" + inscEstadual + '\'' +
               ", anoFundacao=" + anoFundacao +
               '}';
    }

    @Override
    public String toString() {
        return super.toString() + ", " + getDados();
    }
}
