package lista3_lacos_de_repeticao;

import java.util.Scanner;

/*Escrever um programa que receba v�rios n�meros inteiros no teclado. 
E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
*/

public class ex6 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		int numero = 1;
		int somaMultiploDeTres = 0;
		int numerosDigitados = 0;
		int numerosDigitadosmultiplo3 = 0;

		do {
			System.out.print("Digite um n�mero inteiro: ");
			numero = read.nextInt();

			if (numero % 3 == 0) {
				somaMultiploDeTres = somaMultiploDeTres + numero;
				numerosDigitadosmultiplo3 += 1;
			}

			numerosDigitados += 1;
		} while (numero != 0);

		numerosDigitados--;
		numerosDigitadosmultiplo3--;

		System.out.println("--------------------------------------------------");
		System.out.println("O Total de n�meros digitados �: " + numerosDigitados);
		System.out.println("O total de n�meros digitados multiplos de 3 �: " + numerosDigitadosmultiplo3);
		System.out.println("A m�dia dos n�meros m�ltiplos de 3 �: " + (somaMultiploDeTres / numerosDigitadosmultiplo3));
		System.out.println("--------------------------------------------------");

		read.close();
	}

}
