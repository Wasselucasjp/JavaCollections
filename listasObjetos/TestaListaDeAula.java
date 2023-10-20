package br.com.alura.listasObjetos;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

    public static void main(String[] args) {

        Aula a1 = new Aula("Revistando as ArrayLists", 21);
        Aula a2 = new Aula("Listas de objetos", 20);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 15);
     // Cria uma ArrayList chamada "aulas" para armazenar objetos do tipo "Aula".
        ArrayList<Aula> aulas = new ArrayList<>();

        // Adiciona objetos do tipo "Aula" (a1, a2 e a3) à lista "aulas".
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        // Imprime a lista de "aulas" antes de ordená-la.
        System.out.println(aulas);

        // Ordena a lista "aulas" usando o método estático "sort" da classe "Collections".
        Collections.sort(aulas);

        // Imprime a lista de "aulas" após a ordenação.
        System.out.println(aulas);

        // Comentário alternativo: Ordena a lista "aulas" utilizando o método "sort" da própria lista,
        // usando uma expressão lambda para comparar os elementos com base no tempo das aulas.
        // Collections.sort(aulas,Comparator.comparing(Aula::getTempo));
        aulas.sort(Comparator.comparing(Aula::getTempo));

    }
}