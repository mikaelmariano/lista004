package br.edu.up.view;

public class EstacionamentoView {
    public void mostrarMenu() {
        System.out.println("1 - Entrada de Veículo");
        System.out.println("2 - Saída de Veículo");
        System.out.println("3 - Relatório");
        System.out.println("4 - Sair");
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
