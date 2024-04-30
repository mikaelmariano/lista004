package br.edu.up.controller;

import br.edu.up.view.*;
import br.edu.up.model.*;

public class EstacionamentoController {
    private Estacionamento estacionamento;
    private EstacionamentoView view;
    private int contadorEntradas = 0;
    private int contadorSaidas = 0;

    public EstacionamentoController(Estacionamento estacionamento, EstacionamentoView view) {
        this.estacionamento = estacionamento;
        this.view = view;
    }

    public void processarEntradaVeiculo(String modelo, String placa, String cor) {
        if (estacionamento.adicionarVeiculo(new Veiculo(modelo, placa, cor))) {
            contadorEntradas++; // Incrementa o contador de entradas cada vez que um veículo é adicionado com sucesso.
            view.mostrarMensagem("Veículo adicionado com sucesso.");
        } else {
            view.mostrarMensagem("Não há Vagas!");
        }
    }

    public void processarSaidaVeiculo(String placa) {
        if (estacionamento.removerVeiculo(placa)) {
            contadorSaidas++; // Incrementa o contador de saídas cada vez que um veículo é removido com sucesso.
            view.mostrarMensagem("Veículo removido com sucesso.");
        } else {
            view.mostrarMensagem("Veículo não encontrado.");
        }
    }

    public void mostrarRelatorio() {
        double totalPagamentos = estacionamento.calcularPagamentos();
        view.mostrarMensagem("Total de veículos ainda no estacionamento: " + estacionamento.contarVeiculos());
        view.mostrarMensagem("Total de entradas de veículos: " + contadorEntradas);
        view.mostrarMensagem("Total de saídas de veículos: " + contadorSaidas);
        view.mostrarMensagem("Total arrecadado: R$ " + totalPagamentos);
    }

    // Métodos para acessar os contadores, se necessário
    public int getContadorEntradas() {
        return contadorEntradas;
    }

    public int getContadorSaidas() {
        return contadorSaidas;
    }
}
