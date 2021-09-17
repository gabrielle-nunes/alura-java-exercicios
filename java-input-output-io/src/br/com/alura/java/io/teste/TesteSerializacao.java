package br.com.alura.java.io.teste;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException {

		//Transformando um objeto em bits e bytes para gravar no hd
		String nome = "Gabrielle Nunes";
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin")); //FileOutputStream grava a informação no HD
		oos.writeObject(nome); //transforma um objeto em bits e bytes e passa pra FileOutputStream
		oos.close();
	}

}
