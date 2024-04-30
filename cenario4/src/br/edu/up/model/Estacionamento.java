package br.edu.up.model;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {
    private List<Veiculo> veiculos;
    private static final int VAGAS = 10;

    public Estacionamento() {
        veiculos = new ArrayList<>();
    }

    public boolean adicionarVeiculo(Veiculo veiculo) {
        if (veiculos.size() < VAGAS) {
            veiculos.add(veiculo);
            return true;
        }
        return false;
    }

    public boolean removerVeiculo(String placa) {
        for (Veiculo v : veiculos) {
            if (v.getPlaca().equals(placa)) {
                veiculos.remove(v);
                return true;
            }
        }
        return false;
    }

    public int contarVeiculos() {
        return veiculos.size();
    }

    public double calcularPagamentos() {
        return veiculos.size() * 5.0;
    }
}
