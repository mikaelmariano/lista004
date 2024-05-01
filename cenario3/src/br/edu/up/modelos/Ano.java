package br.edu.up.modelos;

public class Ano {
    private int ano;
    private boolean bissexto;
    private Mes[] meses;

    public Ano(int ano, boolean bissexto) {
        this.ano = ano;
        this.bissexto = bissexto;
        this.meses = new Mes[12];

        int[] diasPorMes = {31, (bissexto ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < 12; i++) {
            meses[i] = new Mes(i + 1, diasPorMes[i]);
        }
    }

    public void adicionarCompromisso(Compromisso comp, int mes, int diaMes) {
        if (mes > 0 && mes <= 12) {
            meses[mes - 1].adicionarCompromisso(comp, diaMes);
        } else {
            System.out.println("Mês inválido.");
        }
    }

    public Compromisso consultarCompromisso(int mes, int diaMes, int hora) {
        if (mes > 0 && mes <= 12) {
            return meses[mes - 1].consultarCompromisso(diaMes, hora);
        }
        return null;
    }

    public void excluirCompromisso(int mes, int diaMes, int hora) {
        if (mes > 0 && mes <= 12) {
            meses[mes - 1].excluirCompromisso(diaMes, hora);
        }
    }

    public String listarCompromissos(int mes, int diaMes) {
        if (mes > 0 && mes <= 12) {
            return meses[mes - 1].listarCompromissos(diaMes);
        }
        return "Mês inválido.";
    }
}