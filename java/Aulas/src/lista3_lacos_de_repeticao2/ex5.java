package lista3_lacos_de_repeticao2;

import java.util.Scanner;

/*Obtenha um n�mero digitado pelo usu�rio e repita a opera��o de multiplicar ele por tr�s
(imprimindo o novo valor) at� que ele seja maior do que 100. Ex.: se o usu�rio digita 5, 
deveremos observar na tela a seguinte sequ�ncia: 5 15 45 135.
*/

public class ex5 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		int numero;
		int num;

		System.out.print("Digite um n�mero: ");
		numero = read.nextInt();

		num = numero;

		while (numero <= 100) {
			numero = (numero * 3);
			System.out.print(num + " " + numero + " ");
		}
		read.close();
	}

}
