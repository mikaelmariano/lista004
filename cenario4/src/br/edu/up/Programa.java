package br.edu.up;

import br.edu.up.controller.*;
import br.edu.up.model.*;
import br.edu.up.view.*;
import br.edu.up.util.Prompt;

public class Programa {
    public static void main(String[] args) {
        Estacionamento estacionamento = new Estacionamento();
        EstacionamentoView view = new EstacionamentoView();
        EstacionamentoController controller = new EstacionamentoController(estacionamento, view);

        while (true) {
            view.mostrarMenu();
            int opcao = Prompt.lerInteiro("Escolha uma opção:");

            switch (opcao) {
                case 1:
                    Prompt.imprimir("Digite o modelo do veículo:");
                    String modelo = Prompt.lerLinha();
                    Prompt.imprimir("Digite a placa do veículo:");
                    String placa = Prompt.lerLinha();
                    Prompt.imprimir("Digite a cor do veículo:");
                    String cor = Prompt.lerLinha();
                    controller.processarEntradaVeiculo(modelo, placa, cor);
                    break;
                case 2:
                    placa = Prompt.lerLinha("Digite a placa do veículo para saída:");
                    controller.processarSaidaVeiculo(placa);
                    break;
                case 3:
                    controller.mostrarRelatorio();
                    break;
                case 4:
                    Prompt.imprimir("Saindo...");
                    return;
                default:
                    Prompt.imprimir("Opção inválida.");
                    break;
            }
        }
    }
}