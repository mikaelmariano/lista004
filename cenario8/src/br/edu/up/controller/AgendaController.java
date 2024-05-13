package br.edu.up.controller;

import br.edu.up.model.Agenda;
import br.edu.up.model.Contato;

public class AgendaController {
    private Agenda agenda;

    public AgendaController() {
        agenda = new Agenda();
    }

    public void incluirPessoal(int codigo, String nome, String telefone, String aniversario) {
        agenda.incluirPessoal(codigo, nome, telefone, aniversario);
    }

    public void incluirComercial(int codigo, String nome, String telefone, String cnpj) {
        agenda.incluirComercial(codigo, nome, telefone, cnpj);
    }

    public void excluirContato(int codigo) {
        agenda.excluirContato(codigo);
    }

    public Contato getContato(int codigo) {
        return agenda.getContato(codigo);
    }

    public void listarContatos() {
        agenda.listarContatos();
    }
}
