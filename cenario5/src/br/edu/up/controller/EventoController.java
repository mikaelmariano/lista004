package br.edu.up.controller;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.model.*;



public class EventoController {
    private List<Evento> eventos = new ArrayList<>();

    public void adicionarEvento(Evento evento) {
        eventos.add(evento);
    }

    public void removerEvento(Evento evento) {
        eventos.remove(evento);
    }

    public List<Evento> listarEventos() {
        return new ArrayList<>(eventos); // Retorna uma cópia da lista para evitar modificações externas
    }

    // Método para atualizar ingressos vendidos
    public void venderIngressos(String nomeEvento, int quantidade) {
        for (Evento evento : eventos) {
            if (evento.getNome().equals(nomeEvento)) {
                int novosIngressosVendidos = evento.getIngressosVendidos() + quantidade;
                if (novosIngressosVendidos <= evento.getCapacidadeMaxima()) {
                    evento.setIngressosVendidos(novosIngressosVendidos);
                } else {
                    throw new RuntimeException("Capacidade máxima excedida!");
                }
            }
        }
    }
}
