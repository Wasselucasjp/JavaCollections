package br.com.alura.trabalhandoComArrayList;

import java.util.ArrayList;

public class RemoveItemLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String curso1 = "Java 8: Tire proveito dos novos recursos da linguagem";
        String curso2 = "Apache Camel";
        String curso3 = "Certificacao Java SE 8 Programmer I";

        ArrayList<String> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);        

        // qual metodo chamar aqui?
        cursos.remove(1);
        System.out.println(cursos);
	}

}
