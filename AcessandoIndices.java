package br.com.alura;

import java.util.ArrayList;

//Qual o problema do código a seguir? 
//O que acontecerá ao executá-lo? Experimente para ver a saída.

public class AcessandoIndices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String curso1 = "Java 8: Tire proveito dos novos recursos da linguagem";
	        String curso2 = "Apache Camel";
	        String curso3 = "Certificacao Java SE 8 Programmer I";

	        ArrayList<String> cursos = new ArrayList<>();
	        cursos.add(curso1);
	        cursos.add(curso2);
	        cursos.add(curso3);        

	        for (int i = 0; i < cursos.size(); i++) {
	            System.out.println("Aula : " + cursos.get(i));
	        }

	}

}
