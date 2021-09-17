package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteSerializacao2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		//Transformando bits e bytes em objeto
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		String nome = (String)ois.readObject(); //Fazendo cast pra dizer que o objeto é uma String
		
		ois.close();
		System.out.println(nome);
	}

}
