package lista3_lacos_de_repeticao2;

import java.util.Scanner;

/*Elaborar um programa que efetue a leitura sucessiva de valores num�ricos e apresente no
final o total do somat�rio, a m�dia e o total de valores lidos. O programa deve fazer as 
leituras dos valores enquanto o usu�rio estiver fornecendo valores positivos. Ou seja, o
programa deve parar quando o usu�rio fornecer um valor negativo.
*/

public class ex4 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		int numero = 0;
		int somaValores = 0, mediaValores = 0, totalLidos = 0;

		while (numero >= 0) {
			System.out.print("Digite um n�mero: ");
			numero = read.nextInt();

			totalLidos++;
			if (numero > 0) {
				somaValores = somaValores + numero;
				mediaValores = somaValores / totalLidos;
			}
		}

		System.out.println("--------------------------------------------------------");
		if (numero < 0) {
			System.out.println("Voc� forneceu um n�mero negativo e o programa parou.");
		}
		System.out.println("--------------------------------------------------------");
		System.out.println("A soma dos valores digitados � " + somaValores);
		System.out.println("A m�dia dos valores digitados � " + mediaValores);
		System.out.println("--------------------------------------------------------");

		read.close();

	}

}
