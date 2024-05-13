package br.edu.up;

import br.edu.up.controller.*;
import br.edu.up.model.*;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Programa {
    public static void main(String[] args) {
        // Criação de alguns objetos necessários para o exemplo
        Titulacao titulacaoProfessor = new Titulacao("Universidade X", 2010, "PhD", "Tese sobre Educação");
        Professor professor = new Professor("Dr. Smith", "123456789", "001", "L123456", titulacaoProfessor);

        List<String> curriculo = new ArrayList<>();
        curriculo.add("Introdução à Programação");
        curriculo.add("Algoritmos Avançados");

        HashMap<String, Boolean> competenciasNecessarias = new HashMap<>();
        competenciasNecessarias.put("Programação Básica", true);
        competenciasNecessarias.put("Lógica de Programação", true);

        HashMap<String, Boolean> competenciasComplementares = new HashMap<>();
        competenciasComplementares.put("Trabalho em Equipe", true);
        competenciasComplementares.put("Gestão de Projetos", false);

        Disciplina disciplina = new Disciplina("Programação 101", "P101", curriculo, competenciasNecessarias, competenciasComplementares, professor);

        // Criação do controller
        DisciplinaController controller = new DisciplinaController(disciplina);

        // Adicionando alunos
        Aluno aluno1 = new Aluno("Alice", "987654321", "S2022-0001", "Ciência da Computação", 2022, "Diurno");
        Aluno aluno2 = new Aluno("Bob", "987654322", "S2022-0002", "Ciência da Computação", 2022, "Noturno");

        controller.adicionarAluno(aluno1);
        controller.adicionarAluno(aluno2);

        // Exibir informações da disciplina
        System.out.println(controller.getInfoDisciplina());

        // Listar alunos matriculados
        System.out.println(controller.listarAlunos());

        // Avaliar alunos
        controller.avaliarAlunos();

        // Listar currículo da disciplina
        System.out.println(controller.listarCurriculo());
    }
}
