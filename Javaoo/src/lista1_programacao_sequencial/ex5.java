package lista1_programacao_sequencial;

import java.util.Scanner;

/*Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
respectivamente.*/

public class ex5 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		double n1 = 0;
		double n2 = 0;
		double n3 = 0;
		double mediaPonderada;

		System.out.print("Digite a 1� nota: ");
		n1 = read.nextDouble();

		System.out.print("Digite a 2� nota: ");
		n2 = read.nextDouble();

		System.out.print("Digite a 3� nota: ");
		n3 = read.nextDouble();

		mediaPonderada = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;
		System.out.printf("A m�dia ponderada �:�%.2f", mediaPonderada);
		read.close();

	}

}
