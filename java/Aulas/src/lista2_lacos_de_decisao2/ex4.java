package lista2_lacos_de_decisao2;

import java.util.Scanner;

/*Fa�a um sistema que leia um n�mero inteiro e mostre uma mensagem 
indicando se este n�mero � par ou �mpar, e se � positivo ou negativo.
*/
public class ex4 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		int numero;

		System.out.print("Digite um n�mero: ");
		numero = read.nextInt();

		System.out.println("-------------------------------------");
		if (numero % 2 == 0 && numero >= 0) {
			System.out.println("Esse n�mero � par e positivo.");
		} else if (numero % 2 == 0 && numero < 0) {
			System.out.println("Esse n�mero � par e negativo.");
		}

		if (numero % 2 != 0 && numero >= 0) {
			System.out.println("Esse n�mero � Impar e positivo.");
		} else if (numero % 2 != 0 && numero < 0) {
			System.out.println("Esse n�mero � Impar e negativo.");
		}
		System.out.println("-------------------------------------");

		read.close();

	}

}
