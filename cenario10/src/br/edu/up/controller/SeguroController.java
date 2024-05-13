package br.edu.up.controller;

import br.edu.up.model.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeguroController {
    private List<Seguro> seguros;

    public SeguroController() {
        seguros = new ArrayList<>();
    }

    public boolean adicionarSeguro(Seguro seguro) {
        // Verifica se a apólice já existe.
        for (Seguro s : seguros) {
            if (s.getApolice().equals(seguro.getApolice())) {
                System.out.println("Apólice já existe.");
                return false;
            }
        }
        seguros.add(seguro);
        return true;
    }

    public Seguro getSeguro(String apolice) {
        for (Seguro seguro : seguros) {
            if (seguro.getApolice().equals(apolice)) {
                return seguro;
            }
        }
        return null;
    }

    public void excluirSeguro(String apolice) {
        Seguro seguro = getSeguro(apolice);
        if (seguro != null) {
            seguros.remove(seguro);
            System.out.println("Seguro removido com sucesso!");
        } else {
            System.out.println("Seguro não encontrado.");
        }
    }

    public void excluirTodosSeguros() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Tem certeza de que deseja excluir todos os seguros? (s/n)");
            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("s")) {
                seguros.clear();
                System.out.println("Todos os seguros foram excluídos.");
            } else {
                System.out.println("Ação cancelada.");
            }
        }
    }

    public void listarSeguros() {
        if (seguros.isEmpty()) {
            System.out.println("Nenhum seguro cadastrado.");
        } else {
            for (Seguro seguro : seguros) {
                System.out.println(seguro.toString());
            }
        }
    }

    public int quantidadeSeguros() {
        return seguros.size();
    }
}
