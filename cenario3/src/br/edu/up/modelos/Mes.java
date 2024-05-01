package br.edu.up.modelos;

public class Mes {
    private int nome;
    private int qtdDias;
    private Dia[] dias;

    public Mes(int nome, int qtdDias) {
        this.nome = nome;
        this.qtdDias = qtdDias;
        this.dias = new Dia[qtdDias];
        for (int i = 0; i < qtdDias; i++) {
            dias[i] = new Dia(i + 1);
        }
    }

    public void adicionarCompromisso(Compromisso comp, int diaMes) {
        if (diaMes > 0 && diaMes <= qtdDias) {
            dias[diaMes - 1].adicionarCompromisso(comp);
        } else {
            System.out.println("Dia inválido.");
        }
    }

    public Compromisso consultarCompromisso(int diaMes, int hora) {
        if (diaMes > 0 && diaMes <= qtdDias) {
            return dias[diaMes - 1].consultarCompromisso(hora);
        }
        return null;
    }

    public void excluirCompromisso(int diaMes, int hora) {
        if (diaMes > 0 && diaMes <= qtdDias) {
            dias[diaMes - 1].excluirCompromisso(hora);
        }
    }

    public String listarCompromissos(int diaMes) {
        if (diaMes > 0 && diaMes <= qtdDias) {
            return dias[diaMes - 1].listarCompromissos();
        }
        return "Dia inválido.";
    }
}