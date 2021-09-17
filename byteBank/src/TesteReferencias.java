
public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira é: " + primeiraConta.saldo);
		
		/*O numero de referencia da memória da primeira Conta vai 'apontar'*/
		/*para a segundaConta. Elas vão apontar pro mesmo lugar.*/
		Conta segundaConta = primeiraConta; 
		
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);

		System.out.println(primeiraConta.saldo);
		
		if (primeiraConta == segundaConta) {
			System.out.println("São a mesma conta.");
		}
		//Vai imprimir o mesmo endereço de memória para a primeira e segunda conta.
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
