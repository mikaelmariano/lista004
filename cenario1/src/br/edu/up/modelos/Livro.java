package br.edu.up.modelos;

public class Livro {
    private String codigo;
    private String titulo;
    private String[] autores;
    private String isbn;
    private int ano;

    public Livro(String codigo, String titulo, String[] autores, String isbn, int ano) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autores = autores;
        this.isbn = isbn;
        this.ano = ano;
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String[] getAutores() {
        return autores;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getAno() {
        return ano;
    }

    // Setters
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutores(String[] autores) {
        this.autores = autores;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autores='" + String.join(", ", autores) + '\'' +
                ", isbn='" + isbn + '\'' +
                ", ano=" + ano +
                '}';
    }
}
