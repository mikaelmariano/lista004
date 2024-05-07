package br.edu.up.model;

public class Evento {
    private String nome;
    private String data;
    private String local;
    private int capacidadeMaxima;
    private int ingressosVendidos;
    private double precoIngresso;

    public Evento(String nome, String data, String local, int capacidadeMaxima, double precoIngresso) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.capacidadeMaxima = capacidadeMaxima;
        this.ingressosVendidos = 0; // Inicializa sem ingressos vendidos
        this.precoIngresso = precoIngresso;
    }

    // Getters and setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getData() { return data; }
    public void setData(String data) { this.data = data; }
    public String getLocal() { return local; }
    public void setLocal(String local) { this.local = local; }
    public int getCapacidadeMaxima() { return capacidadeMaxima; }
    public void setCapacidadeMaxima(int capacidadeMaxima) { this.capacidadeMaxima = capacidadeMaxima; }
    public int getIngressosVendidos() { return ingressosVendidos; }
    public void setIngressosVendidos(int ingressosVendidos) { this.ingressosVendidos = ingressosVendidos; }
    public double getPrecoIngresso() { return precoIngresso; }
    public void setPrecoIngresso(double precoIngresso) { this.precoIngresso = precoIngresso; }
}
