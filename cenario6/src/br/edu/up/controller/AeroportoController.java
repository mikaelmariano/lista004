package br.edu.up.controller;

import br.edu.up.model.*;
import java.util.ArrayList;
import java.util.List;



public class AeroportoController {
    private List<Pessoa> pessoas;
    private List<Aeronave> aeronaves;

    public AeroportoController() {
        this.pessoas = new ArrayList<>();
        this.aeronaves = new ArrayList<>();
    }

    // Métodos para gerenciar pessoas
    public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public void removerPessoa(String rg) {
        pessoas.removeIf(p -> p.getRg().equals(rg));
    }

    public List<Pessoa> listarPessoas() {
        return new ArrayList<>(pessoas); // Retorna uma cópia da lista para evitar modificações externas
    }

    public Pessoa buscarPessoaPorRg(String rg) {
        for (Pessoa p : pessoas) {
            if (p.getRg().equals(rg)) {
                return p;
            }
        }
        return null; // Retorna null se não encontrar
    }

    // Métodos para gerenciar aeronaves
    public void adicionarAeronave(Aeronave aeronave) {
        aeronaves.add(aeronave);
    }

    public void removerAeronave(String codigo) {
        aeronaves.removeIf(a -> a.getCodigo().equals(codigo));
    }

    public List<Aeronave> listarAeronaves() {
        return new ArrayList<>(aeronaves); // Retorna uma cópia da lista para evitar modificações externas
    }

    public Aeronave buscarAeronavePorCodigo(String codigo) {
        for (Aeronave a : aeronaves) {
            if (a.getCodigo().equals(codigo)) {
                return a;
            }
        }
        return null; // Retorna null se não encontrar
    }
}
