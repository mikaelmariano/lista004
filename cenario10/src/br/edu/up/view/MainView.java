package br.edu.up.view;

import br.edu.up.controller.SeguroController;
import br.edu.up.model.*;

import java.time.LocalDate;
import java.util.Scanner;

public class MainView {

    public static void launchMenu() {
        SeguroController controller = new SeguroController();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Incluir seguro");
            System.out.println("2. Localizar seguro");
            System.out.println("3. Excluir seguro");
            System.out.println("4. Excluir todos os seguros");
            System.out.println("5. Listar todos os seguros");
            System.out.println("6. Ver quantidade de seguros");
            System.out.println("7. Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha restante

            switch (opcao) {
                case 1:
                    System.out.print("Número da Apólice: ");
                    String apolice = scanner.nextLine();

                    // Verifica se a apólice já existe
                    if (controller.getSeguro(apolice) != null) {
                        System.out.println("Apólice já existe.");
                        break;
                    }

                    System.out.print("Nome do Segurado: ");
                    String nome = scanner.nextLine();

                    System.out.print("RG: ");
                    String RG = scanner.nextLine();

                    System.out.print("CPF: ");
                    String CPF = scanner.nextLine();

                    System.out.print("Sexo (M/F): ");
                    String sexo = scanner.nextLine();

                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();

                    System.out.print("Endereço: ");
                    String endereco = scanner.nextLine();

                    System.out.print("CEP: ");
                    String CEP = scanner.nextLine();

                    System.out.print("Cidade: ");
                    String cidade = scanner.nextLine();

                    Segurado segurado = new Segurado(nome, RG, CPF, sexo, telefone, endereco, CEP, cidade);

                    System.out.print("Valor da Apólice: ");
                    double vlrApolice = scanner.nextDouble();
                    scanner.nextLine(); // Consumir a quebra de linha

                    System.out.print("Data de Início (YYYY-MM-DD): ");
                    LocalDate dtInicio = LocalDate.parse(scanner.nextLine());

                    System.out.print("Data de Fim (YYYY-MM-DD): ");
                    LocalDate dtFim = LocalDate.parse(scanner.nextLine());

                    System.out.print("Tipo de Seguro (1. Vida / 2. Veículo): ");
                    int tipoSeguro = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha

                    Seguro seguro;
                    if (tipoSeguro == 1) {
                        System.out.print("Cobre Doença (true/false): ");
                        boolean cobreDoenca = scanner.nextBoolean();

                        System.out.print("Cobre Acidente (true/false): ");
                        boolean cobreAcidente = scanner.nextBoolean();

                        seguro = new SeguroVida(apolice, segurado, vlrApolice, dtInicio, dtFim, cobreDoenca, cobreAcidente);
                    } else {
                        System.out.print("Valor da Franquia: ");
                        double vlrFranquia = scanner.nextDouble();
                        scanner.nextLine(); // Consumir a quebra de linha

                        System.out.print("Tem Carro Reserva (true/false): ");
                        boolean temCarroReserva = scanner.nextBoolean();

                        System.out.print("Cobre Vidros (true/false): ");
                        boolean cobreVidros = scanner.nextBoolean();

                        seguro = new SeguroVeiculo(apolice, segurado, vlrApolice, dtInicio, dtFim, vlrFranquia, temCarroReserva, cobreVidros);
                    }

                    controller.adicionarSeguro(seguro);
                    System.out.println("Seguro adicionado com sucesso!");
                    break;

                case 2:
                    System.out.print("Número da Apólice: ");
                    String apoliceConsulta = scanner.nextLine();

                    Seguro seguroConsulta = controller.getSeguro(apoliceConsulta);
                    if (seguroConsulta != null) {
                        System.out.println(seguroConsulta.toString());
                    } else {
                        System.out.println("Seguro não encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Número da Apólice: ");
                    String apoliceExclusao = scanner.nextLine();

                    controller.excluirSeguro(apoliceExclusao);
                    break;

                case 4:
                    controller.excluirTodosSeguros();
                    break;

                case 5:
                    controller.listarSeguros();
                    break;

                case 6:
                    System.out.println("Quantidade de seguros: " + controller.quantidadeSeguros());
                    break;

                case 7:
                    System.out.println("Encerrando o programa.");
                    scanner.close();
                    return; // Sai do programa

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}
