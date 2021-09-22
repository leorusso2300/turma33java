package lista3_lacos_de_repeticao2;

import java.util.Scanner;

/*Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no
final o total do somatório, a média e o total de valores lidos. O programa deve fazer as 
leituras dos valores enquanto o usuário estiver fornecendo valores positivos. Ou seja, o
programa deve parar quando o usuário fornecer um valor negativo.
*/

public class ex4 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		int numero = 0;
		int somaValores = 0, mediaValores = 0, totalLidos = 0;

		while (numero >= 0) {
			System.out.print("Digite um número: ");
			numero = read.nextInt();

			totalLidos++;
			if (numero > 0) {
				somaValores = somaValores + numero;
				mediaValores = somaValores / totalLidos;
			}
		}

		System.out.println("--------------------------------------------------------");
		if (numero < 0) {
			System.out.println("Você forneceu um número negativo e o programa parou.");
		}
		System.out.println("--------------------------------------------------------");
		System.out.println("A soma dos valores digitados é " + somaValores);
		System.out.println("A média dos valores digitados é " + mediaValores);
		System.out.println("--------------------------------------------------------");

		read.close();

	}

}
