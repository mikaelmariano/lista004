package br.edu.up;

import br.edu.up.modelos.Livro;


public class Programa {

    public static void main(String[] args) {
        Livro livro1 = new Livro("1598FHK", "Core Java 2", new String[]{"Cay S. Horstmann", "Gary Cornell"}, "0130819336", 2005);
        Livro livro2 = new Livro("9865PLO", "Java, Como programar", new String[]{"Harvey Deitel"}, "0130341517", 2015);

        System.out.println(livro1);
        System.out.println(livro2);
    }
}