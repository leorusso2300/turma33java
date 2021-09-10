package Lista3;

public class ExemploDoWhile {

	public static void main(String[] args) {

		int numero = 233;

		do {

			if (numero > 300 && numero <= 400) {
				
				System.out.println(numero);
				numero = numero + 3;

			} else {
				System.out.println(numero);
				numero = numero + 5;

			}

		} while (numero <= 456);


	}

}
