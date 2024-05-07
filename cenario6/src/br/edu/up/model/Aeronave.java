package br.edu.up.model;

public class Aeronave {
    private String codigo;
    private String tipo;
    private int quantidadeAssentos;

    public Aeronave(String codigo, String tipo, int quantidadeAssentos) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.quantidadeAssentos = quantidadeAssentos;
    }

    // Getters and setters
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public int getQuantidadeAssentos() { return quantidadeAssentos; }
    public void setQuantidadeAssentos(int quantidadeAssentos) { this.quantidadeAssentos = quantidadeAssentos; }
}
