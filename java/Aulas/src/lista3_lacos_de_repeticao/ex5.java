package lista3_lacos_de_repeticao;

import java.util.Scanner;

/* Crie um programa que leia um n�mero do teclado at� 
	que encontre um n�mero igual a zero. (0 para)
	
	No final, mostre a soma dos n�meros digitados.
	(DO...WHILE)
*/

public class ex5 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		int numero = 1;
		int somaTotal = 0;

		do {
			System.out.print("Digite um n�mero: ");
			numero = read.nextInt();
			somaTotal = somaTotal + numero;
		} while (numero != 0);

		System.out.println("----------------------------------------");
		System.out.println("A soma de todos os n�meros �: " + somaTotal);
		System.out.println("----------------------------------------");
		read.close();
	}

}
