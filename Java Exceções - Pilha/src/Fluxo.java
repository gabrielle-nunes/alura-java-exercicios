
public class Fluxo {
	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		}
		
		//Arithmetic e NullPointer no mesmo catch, economiza bloco
		catch(ArithmeticException | NullPointerException | MinhaExcecao ex){ 
		
	    String msg = ex.getMessage(); 
		System.out.println("Exception" + msg);

		ex.printStackTrace(); //rastreio da stack/pilha
		} 
		
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() {
		System.out.println("Ini do metodo2");
		throw new MinhaExcecao(" deu ruim :( ");
		//throw: Jogar. sa�da abrupta do m�todo 2
		//System.out.println("Fim do metodo2");
		}
	}

/*var msg do tipo String recebe a referencia
ex (que aponta para ArithmeticException)
e chama o m�todo getMessage que faz parte
das exce��es*/

/*Cath: capturar a exce��o, var ex � uma refer�ncia e
 * Arithmetic Exception � um tipo de classe*/

//usamos try e catch para exce��o. Catch n�o existe sem o try

/*Ap�s a execu��o do catch a execu��o do programa segue*/
