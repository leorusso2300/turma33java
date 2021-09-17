package lista3_lacos_de_repeticao;

import java.util.Scanner;

/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos
de 21 anos. Total de pessoas com mais de 50 anos.O programa termina quando idade
for =-99. (WHILE)
*/

public class ex3 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int idade = 0;
		int contador1 = 0, contador2 = 0;

		while (idade <= 99) {
			System.out.print("Digite a idade de uma pessoa: ");
			idade = read.nextInt();

			if (idade <= 21) {
				contador1++;
			} else if (idade >= 50 && idade <= 99) {
				contador2++;
			}
		}

		System.out.println("----------------------------------------------");
		System.out.println("O número de pessoas com menos de 21 anos é " + contador1);
		System.out.println("O número de pessoas com mais de 50 anos é " + contador2);
		System.out.println("----------------------------------------------");

		read.close();

	}

}
