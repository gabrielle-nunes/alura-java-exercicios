package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
public class TesteArrayReferencia {

	public static void main(String[] args) {
		
		//contas = referencia para o array de 5 posições
		//ContaCorrente = tipo do array. Usamos import para usá-la
		ContaCorrente[] contas = new ContaCorrente[5];
		
		//criação de conta corrente
		ContaCorrente cc1 = new ContaCorrente(123, 456);
		
		contas[0] = cc1;
		
		ContaCorrente cc2 = new ContaCorrente(789, 143);
		contas[1] = cc2;
		
		System.out.println(cc2.getAgencia());
	}

}
