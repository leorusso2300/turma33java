package Lista3;

import java.util.Locale;
import java.util.Scanner;

public class ExemploWhile {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		double numero = 0.00, soma = 0.0, total = 0.00, media = 0.00;

		while (numero >= 0) {

			System.out.print("Digite um n�mero:");
			numero = leia.nextInt();

			if (numero >= 0) {
				soma = soma + numero;
				total++;
			}

		}
		
		media = (soma / total);
		System.out.println("A soma dos n�meros digitados � de:" + soma);
		System.out.printf("A m�dia dos n�meros digitados � de: %.2f", media);
		System.out.println("\nO total dos n�meros digitados � de:" + total);
		leia.close();
	}

}
