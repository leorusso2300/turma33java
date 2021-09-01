package Lista2;

import java.util.Scanner;

public class ParImparRaiz {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);

		int numero;

		System.out.println("Digite um número inteiro positivo: ");
		numero = leitor.nextInt();

		if (numero == 0) {
			System.out.println("Esse número é neutro");

		} else if (numero < 0) {
			System.out.println("Esse número é negativo");

		} else if (numero % 2 == 0) {

			System.out.printf("A raiz desse número é: %.2f", Math.sqrt(numero));
			System.out.print("\nEsse número é par.");

		} else if (numero % 2 != 0) {
			System.out.println("O quadrado desse número é: " + numero * numero);
			System.out.println("Esse número é impar");

		}
		leitor.close();
	}

	}

