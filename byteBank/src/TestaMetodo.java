
public class TestaMetodo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 100;
		conta.deposita(50);
		System.out.println(conta.saldo);
		
		boolean retirou = conta.saca(20); //guardando valor na vari�vel para exibir em tela
		System.out.println(conta.saldo);
		System.out.println(retirou);
		
		Conta conta2 = new Conta ();
		conta2.deposita(1000);
		
		conta2.transfere(300, conta); //conta2 tranfere para conta.
		/* conta � uma refer�ncia do endere�o de mem�ria, n�o um OBJ conta!*/
		System.out.println(conta2.saldo);
		System.out.println(conta.saldo);
	}
}
