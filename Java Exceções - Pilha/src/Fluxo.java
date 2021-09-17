
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
		//throw: Jogar. saída abrupta do método 2
		//System.out.println("Fim do metodo2");
		}
	}

/*var msg do tipo String recebe a referencia
ex (que aponta para ArithmeticException)
e chama o método getMessage que faz parte
das exceções*/

/*Cath: capturar a exceção, var ex é uma referência e
 * Arithmetic Exception é um tipo de classe*/

//usamos try e catch para exceção. Catch não existe sem o try

/*Após a execução do catch a execução do programa segue*/
