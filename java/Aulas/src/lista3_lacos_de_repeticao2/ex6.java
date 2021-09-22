package lista3_lacos_de_repeticao2;
/*Faça um programa que mostre uma contagem na tela de 233 a 456, só que contando de 
3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.
*/
public class ex6 {

	public static void main(String[] args) {

		int x = 228;
		do {

			if (x >= 300 && x <= 400) {
				x = x + 3;
			} else {
				x = x + 5;
			}

			System.out.println(x);
		} while (x <= 456);
	}

}
