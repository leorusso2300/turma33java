package lista3_lacos_de_repeticao;

import java.util.Scanner;

/* Crie um programa que leia um número do teclado até 
	que encontre um número igual a zero. (0 para)
	
	No final, mostre a soma dos números digitados.
	(DO...WHILE)
*/

public class ex5 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		int numero = 1;
		int somaTotal = 0;

		do {
			System.out.print("Digite um número: ");
			numero = read.nextInt();
			somaTotal = somaTotal + numero;
		} while (numero != 0);

		System.out.println("----------------------------------------");
		System.out.println("A soma de todos os números é: " + somaTotal);
		System.out.println("----------------------------------------");
		read.close();
	}

}
