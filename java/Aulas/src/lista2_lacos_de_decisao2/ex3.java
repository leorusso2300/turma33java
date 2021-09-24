package lista2_lacos_de_decisao2;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int n4 = 0;

		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;

		System.out.print("Digite o 1º número: ");
		n1 = read.nextInt();

		System.out.print("Digite o 2º número: ");
		n2 = read.nextInt();

		System.out.print("Digite o 3º número: ");
		n3 = read.nextInt();

		num1 = n1 * n1;
		num2 = n2 * n2;
		num3 = n3 * n3;

		if (num3 >= 1000) {
			System.out.println(num3);
		} else if (num3 < 1000) {

			System.out.print("Digite o 4º número: ");
			n4 = read.nextInt();
			num4 = n4 * n4;

			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);
			System.out.println(num4);

		}

		read.close();

	}

}
