package lista2_lacos_de_decisao2;

import java.util.Scanner;

/*Faça um sistema que leia um número inteiro e mostre uma mensagem 
indicando se este número é par ou ímpar, e se é positivo ou negativo.
*/
public class ex4 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		int numero;

		System.out.print("Digite um número: ");
		numero = read.nextInt();

		System.out.println("-------------------------------------");
		if (numero % 2 == 0 && numero >= 0) {
			System.out.println("Esse número é par e positivo.");
		} else if (numero % 2 == 0 && numero < 0) {
			System.out.println("Esse número é par e negativo.");
		}

		if (numero % 2 != 0 && numero >= 0) {
			System.out.println("Esse número é Impar e positivo.");
		} else if (numero % 2 != 0 && numero < 0) {
			System.out.println("Esse número é Impar e negativo.");
		}
		System.out.println("-------------------------------------");

		read.close();

	}

}
