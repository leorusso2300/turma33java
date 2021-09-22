package lista3_lacos_de_repeticao2;

import java.util.Scanner;

/*Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por três
(imprimindo o novo valor) até que ele seja maior do que 100. Ex.: se o usuário digita 5, 
deveremos observar na tela a seguinte sequência: 5 15 45 135.
*/

public class ex5 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		int numero;
		int num;

		System.out.print("Digite um número: ");
		numero = read.nextInt();

		num = numero;

		while (numero <= 100) {
			numero = (numero * 3);
			System.out.print(num + " " + numero + " ");
		}
		read.close();
	}

}
