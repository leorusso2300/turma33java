package Lista2;

import java.util.Scanner;

public class ParImparRaiz {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);

		int numero;

		System.out.println("Digite um n�mero inteiro positivo: ");
		numero = leitor.nextInt();

		if (numero == 0) {
			System.out.println("Esse n�mero � neutro");

		} else if (numero < 0) {
			System.out.println("Esse n�mero � negativo");

		} else if (numero % 2 == 0) {

			System.out.printf("A raiz desse n�mero �: %.2f", Math.sqrt(numero));
			System.out.print("\nEsse n�mero � par.");

		} else if (numero % 2 != 0) {
			System.out.println("O quadrado desse n�mero �: " + numero * numero);
			System.out.println("Esse n�mero � impar");

		}
		leitor.close();
	}

	}

