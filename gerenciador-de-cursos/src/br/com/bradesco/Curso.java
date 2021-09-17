package br.com.bradesco;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {
	
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	//retona uma "c�pia" da lista, sendo essa imut�vel, evitando add e remove
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void adiciona (Aula aula) {
		this.aulas.add(aula);
	}
	
}
