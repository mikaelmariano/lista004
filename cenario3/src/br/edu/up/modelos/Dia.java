package br.edu.up.modelos;

public class Dia {
    private int diaMes;
    private Compromisso[] compromissos;

    public Dia(int diaMes) {
        this.diaMes = diaMes;
        this.compromissos = new Compromisso[24];
    }

    public void adicionarCompromisso(Compromisso comp) {
        if (compromissos[comp.getHora()] == null) {
            compromissos[comp.getHora()] = comp;
        } else {
            System.out.println("Já existe um compromisso para esta hora.");
        }
    }

    public Compromisso consultarCompromisso(int hora) {
        return compromissos[hora];
    }

    public void excluirCompromisso(int hora) {
        compromissos[hora] = null;
    }

    public String listarCompromissos() {
        StringBuilder sb = new StringBuilder();
        for (Compromisso comp : compromissos) {
            if (comp != null) {
                sb.append(comp.toString()).append("\n");
            }
        }
        return sb.toString();
    }
}
