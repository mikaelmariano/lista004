package br.edu.up.view;

import br.edu.up.controller.*;
import br.edu.up.model.*;

import java.util.Scanner;
import java.util.List;

public class Menu {
    private EventoController eventoController = new EventoController();
    private Scanner scanner = new Scanner(System.in);

    public void exibirMenu() {
        while (true) {
            System.out.println("\n1. Adicionar Evento");
            System.out.println("2. Remover Evento");
            System.out.println("3. Listar Eventos");
            System.out.println("4. Vender Ingressos");
            System.out.println("5. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    adicionarEvento();
                    break;
                case 2:
                    removerEvento();
                    break;
                case 3:
                    listarEventos();
                    break;
                case 4:
                    venderIngressos();
                    break;
                case 5:
                    System.out.println("Saindo do sistema...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    private void adicionarEvento() {
        System.out.println("Nome do Evento:");
        String nome = scanner.nextLine();

        System.out.println("Data do Evento (formato: YYYY-MM-DD):");
        String data = scanner.nextLine();

        System.out.println("Local do Evento:");
        String local = scanner.nextLine();

        System.out.println("Capacidade Máxima:");
        int capacidade = scanner.nextInt();

        System.out.println("Preço do Ingresso:");
        double preco = scanner.nextDouble();

        Evento evento = new Evento(nome, data, local, capacidade, preco);
        eventoController.adicionarEvento(evento);
        System.out.println("Evento adicionado com sucesso!");
    }

    private void removerEvento() {
        System.out.println("Nome do Evento para remover:");
        String nome = scanner.nextLine();

        List<Evento> eventos = eventoController.listarEventos();
        for (Evento evento : eventos) {
            if (evento.getNome().equals(nome)) {
                eventoController.removerEvento(evento);
                System.out.println("Evento removido com sucesso!");
                return;
            }
        }
        System.out.println("Evento não encontrado.");
    }

    private void listarEventos() {
        List<Evento> eventos = eventoController.listarEventos();
        for (Evento evento : eventos) {
            System.out.println("Nome: " + evento.getNome() + ", Data: " + evento.getData() + ", Local: " + evento.getLocal() +
                               ", Capacidade Máxima: " + evento.getCapacidadeMaxima() + ", Ingressos Vendidos: " +
                               evento.getIngressosVendidos() + ", Preço do Ingresso: " + evento.getPrecoIngresso());
        }
    }

    private void venderIngressos() {
        System.out.println("Nome do Evento para venda de ingressos:");
        String nomeEvento = scanner.nextLine();

        System.out.println("Quantidade de ingressos a vender:");
        int quantidade = scanner.nextInt();

        try {
            eventoController.venderIngressos(nomeEvento, quantidade);
            System.out.println("Ingressos vendidos com sucesso!");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
