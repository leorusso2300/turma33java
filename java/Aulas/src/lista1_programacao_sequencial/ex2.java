package lista1_programacao_sequencial;

/* Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.
*/

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		int idadeEmAnos;
		int idadeEmMeses;
		int idadeEmDias;

		System.out.print("Digite a sua idade em dias: ");
		idadeEmDias = read.nextInt();

		idadeEmAnos = (idadeEmDias / 365);
		idadeEmMeses = (idadeEmDias % 365) / 30;
		idadeEmDias = (idadeEmDias % 365) % 30;

		System.out.println("-------------------------");
		System.out.println("Você tem " + idadeEmAnos + " anos.");
		System.out.println(idadeEmMeses + " Meses");
		System.out.println(idadeEmDias + " dias");
		System.out.println("-------------------------");

		read.close();

	}

}
