
public class CriarConta {
	
	public static void main(String[] args) {
		
	/*operador new cria um novo objeto a 
	partir de uma classe especificada (nesse caso Conta) 
	e retorna uma referência para este objeto.*/
		
		Conta primeiraConta = new Conta(); //primeiraConta recebe o que o new devolver
		primeiraConta.saldo = 200; //atribui saldo da primeira conta
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		//primeiraConta é referência de memória
		
		/*segundaConta É DO TIPO Conta. Como se fosse uma flecha apontando
		para conta*/
		Conta segundaConta = new Conta();
		
		System.out.println("Primeira conta tem: " + primeiraConta.saldo);
		System.out.println("Segunda conta tem: " + segundaConta.saldo);
		segundaConta.saldo = 300;
		
		if(primeiraConta ==  segundaConta) {
			System.out.println("mesma conta");
		} else {
			System.out.println("contas diferentes");
		}
		
		//Vai imprimir endereços de memória diferentes para a primeira e segunda conta.
		System.out.println(primeiraConta);
		System.out.println(segundaConta);

	}

}
