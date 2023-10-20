package br.com.alura.relacionamentoComColecoes;

import java.util.List;

import br.com.alura.listasObjetos.Aula;

public class TestaCurso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Curso javaColecoes = new Curso("Dominando as coleçoes do Java","Paulo Silveira");
		
		List<Aula> aulas = javaColecoes.getAulas();
		
		System.out.println(aulas);
		aulas.add(new Aula("Trabalhando com ArrayList",21));
		System.out.println(aulas);
	}

}
