package lista3_lacos_de_repeticao;

import java.util.Scanner;

/*Escrever um programa que receba vários números inteiros no teclado. 
E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
*/

public class ex6 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		int numero = 1;
		int somaMultiploDeTres = 0;
		int numerosDigitados = 0;
		int numerosDigitadosmultiplo3 = 0;

		do {
			System.out.print("Digite um número inteiro: ");
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
		System.out.println("O Total de números digitados é: " + numerosDigitados);
		System.out.println("O total de números digitados multiplos de 3 é: " + numerosDigitadosmultiplo3);
		System.out.println("A média dos números múltiplos de 3 é: " + (somaMultiploDeTres / numerosDigitadosmultiplo3));
		System.out.println("--------------------------------------------------");

		read.close();
	}

}
