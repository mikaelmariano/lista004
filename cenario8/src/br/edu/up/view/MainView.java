package br.edu.up.view;

import br.edu.up.controller.AgendaController;
import br.edu.up.model.Contato;

import java.util.Scanner;

public class MainView {

    public static void launchMenu() {
        AgendaController controller = new AgendaController();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Incluir um contato pessoal");
            System.out.println("2. Incluir um contato comercial");
            System.out.println("3. Excluir um contato pelo código");
            System.out.println("4. Consultar um contato pelo código");
            System.out.println("5. Listar todos os contatos");
            System.out.println("6. Sair do programa");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha restante

            switch (opcao) {
                case 1:
                    System.out.print("Código: ");
                    int codigoPessoal = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha

                    System.out.print("Nome: ");
                    String nomePessoal = scanner.nextLine();

                    System.out.print("Telefone: ");
                    String telefonePessoal = scanner.nextLine();

                    System.out.print("Aniversário: ");
                    String aniversario = scanner.nextLine();

                    controller.incluirPessoal(codigoPessoal, nomePessoal, telefonePessoal, aniversario);
                    System.out.println("Contato pessoal adicionado com sucesso!");
                    break;

                case 2:
                    System.out.print("Código: ");
                    int codigoComercial = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha

                    System.out.print("Nome: ");
                    String nomeComercial = scanner.nextLine();

                    System.out.print("Telefone: ");
                    String telefoneComercial = scanner.nextLine();

                    System.out.print("CNPJ: ");
                    String cnpj = scanner.nextLine();

                    controller.incluirComercial(codigoComercial, nomeComercial, telefoneComercial, cnpj);
                    System.out.println("Contato comercial adicionado com sucesso!");
                    break;

                case 3:
                    System.out.print("Código do contato a excluir: ");
                    int codigoExclusao = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha

                    controller.excluirContato(codigoExclusao);
                    break;

                case 4:
                    System.out.print("Código do contato a consultar: ");
                    int codigoConsulta = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha

                    Contato contato = controller.getContato(codigoConsulta);
                    if (contato != null) {
                        System.out.println(contato.toString());
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 5:
                    controller.listarContatos();
                    break;

                case 6:
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
