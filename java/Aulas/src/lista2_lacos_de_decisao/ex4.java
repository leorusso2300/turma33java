package lista2_lacos_de_decisao;

import java.util.Scanner;

/*Fa�a um programa em que permita a entrada de um n�mero qualquer
e exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz 
quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.
*/

public class ex4 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		int numero;
		System.out.print("Digite um n�mero qualquer: ");
		numero = read.nextInt();
		System.out.println("-------------------------------");
		if (numero < 0) {
			System.out.println("Digite um n�mero positivo!");
		} else {
			if (numero % 2 == 0) {

				System.out.println("Esse n�mero � par, e sua raiz � " + Math.sqrt(numero));
			} else if (numero % 2 != 0) {
				System.out.println("Esse n�mero � Impar, e o quadrado desse n�mero � " + Math.pow(numero, 2));

			}
		}
		read.close();
	}

}
