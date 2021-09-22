package lista3_lacos_de_repeticao2;

/*Desenvolver um sistema que efetue a soma de todos os números ímpares que são  múltiplos 
de três e que se encontram no conjunto dos números de 1 até 500.
*/
public class ex3 {

	public static void main(String[] args) {

		int soma = 0;
		for (int x = 0; x <= 500; x++) {

			if (x % 2 != 0 && x % 3 == 0) {
				soma = soma + x;
				System.out.println(soma);
			}
		}

	}

}
