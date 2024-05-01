package br.edu.up;

import br.edu.up.modelos.Ano;
import br.edu.up.modelos.Compromisso;

public class Agenda {
    public static void main(String[] args) {
        Ano ano2024 = new Ano(2024, true);

        Compromisso compromisso1 = new Compromisso("João", "Sala de Reuniões", "Reunião de Projeto", 14);
        
        ano2024.adicionarCompromisso(compromisso1, 3, 15); 

        String compromissosDeMar15 = ano2024.listarCompromissos(3, 15);
        System.out.println("Compromissos para 15 de Março: \n" + compromissosDeMar15);
    }
}