package lista3_lacos_de_repeticao2;

/*Faça um programa que pegue um número do teclado e calcule a soma de todos os números
de 1 até ele. Ex.: o usuário entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.
*/

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		int numero;
		int cont = 0;
		int soma = 0;
		System.out.print("Digite um número: ");
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
