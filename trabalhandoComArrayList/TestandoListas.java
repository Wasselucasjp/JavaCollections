package br.com.alura.trabalhandoComArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

   

	public static void main(String[] args) {

        String aula1 = "Modelando a classe Aula";
        String aula2 = "Conhecendo mais de listas";
        String aula3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);        
       // aulas.remove(aula3); remove uma aula

        System.out.println(aulas);
        
        for(String aula : aulas) {
        	System.out.println("Aula: " + aula);
        }
        
       String primeiraAula = aulas.get(0);
       System.out.println("primeira aula é " + primeiraAula);
       
       for (int i = 0; i < aulas.size(); i++) {
    	   System.out.println("aula : " + aulas.get(i));
       }
       
       //ForEach
       aulas.forEach(aula  -> {
    	   System.out.println("percorrendo:");
    	   System.out.println("Aula " + aula);
    	   });
       
       Collections.sort(aulas);
       System.out.println("Depois de ordenado");
       System.out.println(aulas);
	}
}