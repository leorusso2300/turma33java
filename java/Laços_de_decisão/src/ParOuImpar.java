import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int numero;

		System.out.println("Digite um número inteiro positivo: ");
		numero = leitor.nextInt();

		if (numero == 0) {
			System.out.println("Esse número é neutro");

		} else if (numero < 0) {
			System.out.println("Esse número é negativo");

		} else if (numero % 2 == 0) {

			System.out.println("Esse número é par");

		} else if (numero % 2 != 0) {
			System.out.println("Esse número é impar");

		}
		leitor.close();
	}

}
