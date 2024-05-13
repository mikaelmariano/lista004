package br.edu.up.controller;

import br.edu.up.model.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteController {
    private List<Cliente> clientes;

    public ClienteController() {
        clientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void excluirCliente(int codigo) {
        Cliente cliente = getCliente(codigo);
        if (cliente != null) {
            clientes.remove(cliente);
            System.out.println("Cliente removido com sucesso!");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    public Cliente getCliente(int codigo) {
        if (codigo < clientes.size()) {
            return clientes.get(codigo);
        }
        return null;
    }

    public void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            for (Cliente cliente : clientes) {
                System.out.println(cliente.toString());
            }
        }
    }

    public void emprestar(int codigo, double valor) {
        Cliente cliente = getCliente(codigo);
        if (cliente != null) {
            cliente.emprestar(valor);
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    public void devolver(int codigo, double valor) {
        Cliente cliente = getCliente(codigo);
        if (cliente != null) {
            cliente.devolver(valor);
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }
}
