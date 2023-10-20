package br.com.alura.relacionamentoComColecoes;

import java.util.LinkedList;
import java.util.List;

import br.com.alura.listasObjetos.Aula;

public class Curso {

	private String nome;
	private String instrutor;
	private List <Aula> aulas = new LinkedList<Aula>();
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.nome = instrutor;
	}
	
	public String getNome() {
		return nome;
	}
	public String getInstrutor() {
		return instrutor;
	}
	public List<Aula> getAulas() {
		return aulas;
	}
	
	
	
}
