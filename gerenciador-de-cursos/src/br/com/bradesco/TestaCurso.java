package br.com.bradesco;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		
		//adicionando uma nova aula a list Aula. Passando parametro String e int, conforme o construtor da classe.
		javaColecoes.adiciona(new Aula ("Trabalhando com ArrayList", 21)); 
		javaColecoes.adiciona(new Aula ("Criando uma Aula", 15));
		javaColecoes.adiciona(new Aula ("Modelando com coleções", 12));
		
		System.out.println(javaColecoes.getAulas());
		
	}

}
