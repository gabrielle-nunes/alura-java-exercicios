package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
public class TesteArrayObject {

	public static void main(String[] args) {
	
		//contas = referencia para o array de 5 posi��es
		//ContaCorrente = tipo do array. Usamos import para us�-la
		Conta[] contas = new Conta[5];
		
		//cria��o de conta corrente
		ContaCorrente cc1 = new ContaCorrente(123, 456);
		
		contas[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(789, 143);
		contas[1] = cc2;
		
		System.out.println(cc2.getAgencia());
		
		//exemplo de mais uma refer�ncia. Fazendo um cast, onde transforma uma refer�ncia mais gen�rica em mais espec�fica
		ContaPoupanca ref = (ContaPoupanca) contas[1];
		System.out.println(ref.getAgencia());
	}

}
