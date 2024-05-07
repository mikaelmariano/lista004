package br.edu.up.view;

import br.edu.up.controller.*;
import br.edu.up.model.*;
import br.edu.up.util.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private AeroportoController aeroportoController = new AeroportoController();
    private Scanner scanner = new Scanner(System.in);

    public void exibirMenu() {
        while (true) {
            System.out.println("\n--- Menu de Controle de Tráfego Aéreo ---");
            System.out.println("1. Adicionar Passageiro");
            System.out.println("2. Adicionar Tripulante");
            System.out.println("3. Remover Pessoa");
            System.out.println("4. Listar Pessoas");
            System.out.println("5. Adicionar Aeronave");
            System.out.println("6. Remover Aeronave");
            System.out.println("7. Listar Aeronaves");
            System.out.println("8. Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir newline left-over

            switch (opcao) {
                case 1:
                    adicionarPassageiro();
                    break;
                case 2:
                    adicionarTripulante();
                    break;
                case 3:
                    removerPessoa();
                    break;
                case 4:
                    listarPessoas();
                    break;
                case 5:
                    adicionarAeronave();
                    break;
                case 6:
                    removerAeronave();
                    break;
                case 7:
                    listarAeronaves();
                    break;
                case 8:
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public void adicionarPassageiro() {
        System.out.print("Nome do Passageiro: ");
        String nome = scanner.nextLine();
        System.out.print("RG do Passageiro: ");
        String rg = scanner.nextLine();
        System.out.print("Código da Aeronave: ");
        String codigoAeronave = scanner.nextLine();
        System.out.print("Número do Assento: ");
        String numeroAssento = scanner.nextLine();
        System.out.print("Classe do Assento: ");
        String classeAssento = scanner.nextLine();
        System.out.print("Data do Voo (dd/MM/yyyy HH:mm): ");
        String dataVoo = scanner.nextLine();

        Aeronave aeronave = aeroportoController.buscarAeronavePorCodigo(codigoAeronave);
        if (aeronave != null) {
            Passageiro passageiro = new Passageiro(nome, rg, "BagagemXYZ", new Passagem(numeroAssento, classeAssento, dataVoo));
            aeroportoController.adicionarPessoa(passageiro);
            System.out.println("Passageiro adicionado com sucesso!");
        } else {
            System.out.println("Aeronave não encontrada!");
        }
    }
}
    private void adicionarTripulante() {
        System.out.print("Nome do Tripulante: ");
        String nome = scanner.nextLine();
        System.out.print("RG do Tripulante: ");
        String rg = scanner.nextLine();
        System.out.print("Código da Aeronave: ");
        String codigoAeronave = scanner.nextLine();
        
        Aeronave aeronave = aeroportoController.buscarAeronavePorCodigo(codigoAeronave);
        if (aeronave != null) {
            Tripulante tripulante = new Comissario(nome, rg, aeronave, "ID1234", "Matr123", new String[]{"Inglês", "Espanhol"});
            aeroportoController.adicionarPessoa(tripulante);
            System.out.println("Tripulante adicionado com sucesso!");
        } else {
            System.out.println("Aeronave não encontrada!");
        }
    }

    private void removerPessoa() {
        System.out.print("RG da Pessoa para remover: ");
        String rg = scanner.nextLine();
        aeroportoController.removerPessoa(rg);
        System.out.println("Pessoa removida com sucesso!");
    }

    private void listarPessoas() {
        List<Pessoa> pessoas = aeroportoController.listarPessoas();
        pessoas.forEach(pessoa -> System.out.println("Nome: " + pessoa.getNome() + ", RG: " + pessoa.getRg() + ", Aeronave: " + pessoa.getAeronave().getCodigo()));
    }

    private void adicionarAeronave() {
        System.out.print("Código da Aeronave: ");
        String codigo = scanner.nextLine();
        System.out.print("Tipo da Aeronave: ");
        String tipo = scanner.nextLine();
        System.out.print("Quantidade de Assentos: ");
        int quantidadeAssentos = scanner.nextInt();
        scanner.nextLine(); // Consumir newline left-over

        Aeronave aeronave = new Aeronave(codigo, tipo, quantidadeAssentos);
        aeroportoController.adicionarAeronave(aeronave);
        System.out.println("Aeronave adicionada com sucesso!");
    }

    private void removerAeronave() {
        System.out.print("Código da Aeronave para remover: ");
        String codigo = scanner.nextLine();
        aeroportoController.removerAeronave(codigo);
        System.out.println("Aeronave removida com sucesso!");
    }

    private void listarAeronaves() {
        List<Aeronave> aeronaves = aeroportoController.listarAeronaves();
        aeronaves.forEach(aeronave -> System.out.println("Código: " + aeronave.getCodigo() + ", Tipo: " + aeronave.getTipo() + ", Assentos: " + aeronave.getQuantidadeAssentos()));
    }
}
