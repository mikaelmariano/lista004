package br.edu.up;

import br.edu.up.controller.*;
import br.edu.up.view.*;

public class Programa {

    public static void main(String[] args) {
        AeroportoController aeroportoController = new AeroportoController(); // Instância do controlador
        AeroportoView aeroportoView = new AeroportoView(aeroportoController); // Instância da view com referência ao controlador

        boolean continuar = true;
        Scanner scanner = new Scanner(System.in);

        while (continuar) {
            System.out.println("Menu Principal");
            System.out.println("1. Adicionar Passageiro");
            System.out.println("2. Adicionar Tripulante");
            System.out.println("3. Listar Pessoas");
            System.out.println("4. Adicionar Aeronave");
            System.out.println("5. Listar Aeronaves");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    aeroportoView.adicionarPassageiro();
                    break;
                case 2:
                    aeroportoView.adicionarTripulante();
                    break;
                case 3:
                    aeroportoView.listarPessoas();
                    break;
                case 4:
                    aeroportoView.adicionarAeronave();
                    break;
                case 5:
                    aeroportoView.listarAeronaves();
                    break;
                case 6:
                    continuar = false; // Encerra o loop
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}
