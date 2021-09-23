package lista2_lacos_de_decisao;

/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria 
 * ela se encontra:
•	10-14 infantil
•	15-17 juvenil
•	18-25 adulto
*/

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		int idade;

		System.out.print("Digite a sua idade: ");
		idade = read.nextInt();

		System.out.println("-------");

		if (idade >= 10 && idade <= 14) {
			System.out.println("Infantil");
		} else if (idade >= 15 && idade <= 17) {
			System.out.println("Juvenil");
		} else if (idade >= 18) {
			System.out.println("Adulto");
		}

		read.close();
	}

}
