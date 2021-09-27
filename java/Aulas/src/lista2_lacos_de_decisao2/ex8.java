package lista2_lacos_de_decisao2;

import java.util.Scanner;

/* Construa um sistema para ler uma variável numérica N e imprimi-la
somente se a mesma for maior que 100, caso contrário imprimi-la com o valor zero.
*/

public class ex8 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int n;

		System.out.print("Variável N: ");
		n = read.nextInt();

		if (n > 100) {
			System.out.print("Variável N: " + n);
		} else {
			System.out.print("Variável N: " + (n = 0));
		}

		read.close();
	}

}
