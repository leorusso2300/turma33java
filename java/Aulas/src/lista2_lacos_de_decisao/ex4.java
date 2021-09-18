package lista2_lacos_de_decisao;

import java.util.Scanner;

/*Faça um programa em que permita a entrada de um número qualquer
e exiba se este número é par ou ímpar. Se for par exiba também a raiz 
quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
*/

public class ex4 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		int numero;
		System.out.print("Digite um número qualquer: ");
		numero = read.nextInt();
		System.out.println("-------------------------------");
		if (numero < 0) {
			System.out.println("Digite um número positivo!");
		} else {
			if (numero % 2 == 0) {

				System.out.println("Esse número é par, e sua raiz é " + Math.sqrt(numero));
			} else if (numero % 2 != 0) {
				System.out.println("Esse número é Impar, e o quadrado desse número é " + Math.pow(numero, 2));

			}
		}
		read.close();
	}

}
