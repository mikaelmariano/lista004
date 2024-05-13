package br.edu.up.model;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public void incluirPessoal(int codigo, String nome, String telefone, String aniversario) {
        contatos.add(new Pessoal(codigo, nome, telefone, aniversario));
    }

    public void incluirComercial(int codigo, String nome, String telefone, String cnpj) {
        contatos.add(new Comercial(codigo, nome, telefone, cnpj));
    }

    public void excluirContato(int codigo) {
        Contato contato = getContato(codigo);
        if (contato != null) {
            contatos.remove(contato);
            System.out.println("Contato removido com sucesso!");
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    public Contato getContato(int codigo) {
        for (Contato contato : contatos) {
            if (contato.getCodigo() == codigo) {
                return contato;
            }
        }
        return null;
    }

    public void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("A agenda está vazia.");
        } else {
            for (Contato contato : contatos) {
                System.out.println(contato.toString());
            }
        }
    }
}
