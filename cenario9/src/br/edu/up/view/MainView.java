package br.edu.up.view;

import br.edu.up.controller.ClienteController;
import br.edu.up.model.*;

import java.util.Scanner;

public class MainView {

    public static void launchMenu() {
        ClienteController controller = new ClienteController();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar Cliente Pessoa");
            System.out.println("2. Adicionar Cliente Empresa");
            System.out.println("3. Excluir Cliente");
            System.out.println("4. Consultar Cliente");
            System.out.println("5. Listar Todos os Clientes");
            System.out.println("6. Emprestar Dinheiro a um Cliente");
            System.out.println("7. Devolver Dinheiro a um Cliente");
            System.out.println("8. Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha restante

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nomePessoa = scanner.nextLine();

                    System.out.print("Telefone: ");
                    String telefonePessoa = scanner.nextLine();

                    System.out.print("Email: ");
                    String emailPessoa = scanner.nextLine();

                    System.out.print("Rua: ");
                    String ruaPessoa = scanner.nextLine();

                    System.out.print("Número: ");
                    String numeroPessoa = scanner.nextLine();

                    System.out.print("Bairro: ");
                    String bairroPessoa = scanner.nextLine();

                    System.out.print("CEP: ");
                    String cepPessoa = scanner.nextLine();

                    System.out.print("Cidade: ");
                    String cidadePessoa = scanner.nextLine();

                    System.out.print("UF: ");
                    String UFPessoa = scanner.nextLine();

                    Endereco enderecoPessoa = new Endereco(ruaPessoa, numeroPessoa, bairroPessoa, cepPessoa, new Cidade(cidadePessoa, UFPessoa));

                    System.out.print("CPF: ");
                    String CPF = scanner.nextLine();

                    System.out.print("Peso: ");
                    double peso = scanner.nextDouble();
                    scanner.nextLine(); // Consumir a quebra de linha

                    System.out.print("Altura: ");
                    double altura = scanner.nextDouble();
                    scanner.nextLine(); // Consumir a quebra de linha

                    ClientePessoa clientePessoa = new ClientePessoa(nomePessoa, telefonePessoa, emailPessoa, enderecoPessoa, CPF, peso, altura);
                    controller.adicionarCliente(clientePessoa);
                    System.out.println("Cliente Pessoa adicionado com sucesso!");
                    break;

                case 2:
                    System.out.print("Nome: ");
                    String nomeEmpresa = scanner.nextLine();

                    System.out.print("Telefone: ");
                    String telefoneEmpresa = scanner.nextLine();

                    System.out.print("Email: ");
                    String emailEmpresa = scanner.nextLine();

                    System.out.print("Rua: ");
                    String ruaEmpresa = scanner.nextLine();

                    System.out.print("Número: ");
                    String numeroEmpresa = scanner.nextLine();

                    System.out.print("Bairro: ");
                    String bairroEmpresa = scanner.nextLine();

                    System.out.print("CEP: ");
                    String cepEmpresa = scanner.nextLine();

                    System.out.print("Cidade: ");
                    String cidadeEmpresa = scanner.nextLine();

                    System.out.print("UF: ");
                    String UFEmpresa = scanner.nextLine();

                    Endereco enderecoEmpresa = new Endereco(ruaEmpresa, numeroEmpresa, bairroEmpresa, cepEmpresa, new Cidade(cidadeEmpresa, UFEmpresa));

                    System.out.print("CNPJ: ");
                    String CNPJ = scanner.nextLine();

                    System.out.print("Inscrição Estadual: ");
                    String inscEstadual = scanner.nextLine();

                    System.out.print("Ano de Fundação: ");
                    int anoFundacao = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha

                    ClienteEmpresa clienteEmpresa = new ClienteEmpresa(nomeEmpresa, telefoneEmpresa, emailEmpresa, enderecoEmpresa, CNPJ, inscEstadual, anoFundacao);
                    controller.adicionarCliente(clienteEmpresa);
                    System.out.println("Cliente Empresa adicionado com sucesso!");
                    break;

                case 3:
                    System.out.print("Código do cliente a excluir: ");
                    int codigoExclusao = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha

                    controller.excluirCliente(codigoExclusao);
                    break;

                case 4:
                    System.out.print("Código do cliente a consultar: ");
                    int codigoConsulta = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha

                    Cliente cliente = controller.getCliente(codigoConsulta);
                    if (cliente != null) {
                        System.out.println(cliente.toString());
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;

                case 5:
                    controller.listarClientes();
                    break;

                case 6:
                    System.out.print("Código do cliente: ");
                    int codigoEmprestimo = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha

                    System.out.print("Valor a emprestar: ");
                    double valorEmprestimo = scanner.nextDouble();
                    scanner.nextLine(); // Consumir a quebra de linha

                    controller.emprestar(codigoEmprestimo, valorEmprestimo);
                    break;

                case 7:
                    System.out.print("Código do cliente: ");
                    int codigoDevolucao = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha

                    System.out.print("Valor a devolver: ");
                    double valorDevolucao = scanner.nextDouble();
                    scanner.nextLine(); // Consumir a quebra de linha

                    controller.devolver(codigoDevolucao, valorDevolucao);
                    break;

                case 8:
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
