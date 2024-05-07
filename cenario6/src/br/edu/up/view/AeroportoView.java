package br.edu.up.view;

import br.edu.up.controller.*;
import br.edu.up.model.*;

import java.util.Scanner;
import java.util.List;

public class AeroportoView {
    private Scanner scanner;
    private AeroportoController aeroportoController;

    public AeroportoView(AeroportoController aeroportoController) {
        this.aeroportoController = aeroportoController;
        this.scanner = new Scanner(System.in);
    }

    public void adicionarPassageiro() {
        System.out.print("Nome do Passageiro: ");
        String nome = scanner.nextLine();
        System.out.print("RG do Passageiro: ");
        String rg = scanner.nextLine();
        System.out.print("Código da Aeronave: ");
        String codigoAeronave = scanner.nextLine();
        System.out.print("Identificador de Bagagem: ");
        String bagagem = scanner.nextLine();
        System.out.print("Número do Assento: ");
        String numeroAssento = scanner.nextLine();
        System.out.print("Classe do Assento: ");
        String classeAssento = scanner.nextLine();
        System.out.print("Data do Voo (dd/MM/yyyy HH:mm): ");
        String dataVoo = scanner.nextLine();

        Aeronave aeronave = aeroportoController.buscarAeronavePorCodigo(codigoAeronave);
        if (aeronave != null) {
            Passageiro passageiro = new Passageiro(nome, rg, bagagem, new Passagem(numeroAssento, classeAssento, dataVoo));
            aeroportoController.adicionarPessoa(passageiro);
            System.out.println("Passageiro adicionado com sucesso!");
        } else {
            System.out.println("Aeronave não encontrada!");
        }
    }

    public void adicionarTripulante() {
        // Implementação similar ao adicionarPassageiro, mas para Tripulante
    }

    public void listarPessoas() {
        List<Pessoa> pessoas = aeroportoController.listarPessoas();
        if (pessoas.isEmpty()) {
            System.out.println("Nenhuma pessoa cadastrada.");
        } else {
            for (Pessoa pessoa : pessoas) {
                System.out.println(pessoa);
            }
        }
    }

    public void adicionarAeronave() {
        System.out.print("Código da Aeronave: ");
        String codigo = scanner.nextLine();
        System.out.print("Tipo da Aeronave: ");
        String tipo = scanner.nextLine();
        System.out.print("Quantidade de Assentos: ");
        int quantidadeAssentos = scanner.nextInt();
        scanner.nextLine(); // Limpar buffer do scanner

        Aeronave aeronave = new Aeronave(codigo, tipo, quantidadeAssentos);
        aeroportoController.adicionarAeronave(aeronave);
        System.out.println("Aeronave adicionada com sucesso!");
    }

    public void listarAeronaves() {
        List<Aeronave> aeronaves = aeroportoController.listarAeronaves();
        if (aeronaves.isEmpty()) {
            System.out.println("Nenhuma aeronave cadastrada.");
        } else {
            for (Aeronave aeronave : aeronaves) {
                System.out.println(aeronave);
            }
        }
    }
}
