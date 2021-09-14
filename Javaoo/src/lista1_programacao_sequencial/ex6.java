package lista1_programacao_sequencial;

import java.util.Scanner;

public class ex6 {
	public static void main(String[] args) {
		double x1;
		double x2;
		double y1;
		double y2;
		double d;

		Scanner read = new Scanner(System.in);

		x1 = 0;
		x2 = 0;
		y1 = 0;
		y2 = 0;
		System.out.print("x1: ");
		x1 = read.nextInt();
		System.out.print("x2: ");
		x2 = read.nextInt();
		System.out.print("y1: ");
		y1 = read.nextInt();
		System.out.print("y2: ");
		y2 = read.nextInt();
		d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.printf("A distância entre os pontos é: %.2f", d);
		read.close();
	}
}
