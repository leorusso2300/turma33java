import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int numero;

		System.out.println("Digite um n�mero inteiro positivo: ");
		numero = leitor.nextInt();

		if (numero == 0) {
			System.out.println("Esse n�mero � neutro");

		} else if (numero < 0) {
			System.out.println("Esse n�mero � negativo");

		} else if (numero % 2 == 0) {

			System.out.println("Esse n�mero � par");

		} else if (numero % 2 != 0) {
			System.out.println("Esse n�mero � impar");

		}
		leitor.close();
	}

}
