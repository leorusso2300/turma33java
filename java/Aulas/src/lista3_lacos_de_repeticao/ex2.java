package lista3_lacos_de_repeticao;
import java.util.Scanner;

//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

public class ex2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int numero;
		int contadorPar = 0;
		int contadorImpar = 0;

		for (int y = 1; y <= 10; y++) {
			System.out.print("Digite o " + y + "� n�mero:");
			numero = read.nextInt();

			if (numero % 2 == 0) {
				contadorPar++;

			} else if (numero % 2 != 0) {
				contadorImpar++;

			}

		}
		System.out.println("---------------------------------");
		System.out.println("O n�mero de n�meros pares �: " + contadorPar);
		System.out.println("O n�mero de n�meros impares �: " + contadorImpar);
		System.out.println("---------------------------------");

		read.close();
	}

}
