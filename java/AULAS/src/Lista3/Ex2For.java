package Lista3;

import java.util.Scanner;

public class Ex2For {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		int numero, somaPar = 0, somaImpar = 0;
		for (int x = 1; x <= 10; x++) {

			System.out.print("Digite o " + x + "° número: ");
			numero = leitor.nextInt();

			if (numero % 2 == 0) {
				somaPar = somaPar + 1;

			} else if (numero % 2 != 0) {
				somaImpar = somaImpar + numero;
			}

		}
		System.out.println("O tatal de números pares são: " + somaPar);
		System.out.println("O tatal de números ímpares são: " + somaImpar);
		leitor.close();
	}

}
