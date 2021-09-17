package br.com.bytebank.banco.teste;

public class TesteArrayString {

	public static void main(String[] args) {
		System.out.println("Deu boa!");
		
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]); //impressão no cmd
			//usar o run configurations para imprimir no eclipse, utilizando o arguments
		}
		
	}
}
