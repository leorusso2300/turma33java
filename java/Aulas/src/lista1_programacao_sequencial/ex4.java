package lista1_programacao_sequencial;

import java.util.Scanner;

/* Escreva um sistema que leia três números inteiros
e positivos (A, B, C) e calcule a seguinte 
expressão:
*/

public class ex4 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int A = 0;
		int B = 0;
		int C = 0;
		int D = 0;
		int R = 0;
		int S = 0;

		System.out.print("Valor de A: ");
		A = read.nextInt();
		System.out.print("Valor de B: ");
		B = read.nextInt();
		System.out.print("Valor de C: ");
		C = read.nextInt();

		R = (int) Math.pow((A + B), 2);
		S = (int) Math.pow((A + C), 2);
		D = (R + S) / 2;
		System.out.println("-------------------------");
		System.out.println("R = " + R);
		System.out.println("D = " + D);
		System.out.println("S = " + S);
		System.out.println("-------------------------");

		read.close();

	}

}
