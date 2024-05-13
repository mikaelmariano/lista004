package br.edu.up.model;

public abstract class Cliente {
    private String nome;
    private String telefone;
    private String email;
    private Endereco endereco;
    private double vlrMaxCredito;
    private double vlrEmprestado;

    public Cliente(String nome, String telefone, String email, Endereco endereco, double vlrMaxCredito) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.vlrMaxCredito = vlrMaxCredito;
        this.vlrEmprestado = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public double getVlrMaxCredito() {
        return vlrMaxCredito;
    }

    public double getVlrEmprestado() {
        return vlrEmprestado;
    }

    public double getSaldo() {
        return vlrMaxCredito - vlrEmprestado;
    }

    public void emprestar(double valor) {
        if (vlrEmprestado + valor <= vlrMaxCredito) {
            vlrEmprestado += valor;
        } else {
            System.out.println("Valor excede o máximo de crédito.");
        }
    }

    public void devolver(double valor) {
        if (vlrEmprestado - valor >= 0) {
            vlrEmprestado -= valor;
        } else {
            System.out.println("Saldo negativo não permitido.");
        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
               "nome='" + nome + '\'' +
               ", telefone='" + telefone + '\'' +
               ", email='" + email + '\'' +
               ", endereco=" + endereco.toString() +
               ", vlrMaxCredito=" + vlrMaxCredito +
               ", vlrEmprestado=" + vlrEmprestado +
               '}';
    }
}
