package lista3_lacos_de_repeticao2;

/*Fa�a um programa que pegue um n�mero do teclado e calcule a soma de todos os n�meros
de 1 at� ele. Ex.: o usu�rio entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.
*/

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		int numero;
		int cont = 0;
		int soma = 0;
		System.out.print("Digite um n�mero: ");
		numero = read.nextInt();

		do {

			cont = cont + 1;
			soma = soma + cont;
			System.out.println(cont);

		} while (cont != numero);

		System.out.println(soma);

		read.close();
	}
}
