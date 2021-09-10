import java.util.Scanner;

public class Ex1DoWhile {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		int numero, SomaLeitor = 0;

		do {
			System.out.print("Digite um número: ");
			numero = leitor.nextInt();

			SomaLeitor = SomaLeitor + numero;

		} while (numero != 0);
		System.out.println("A soma dos números digitados é: " + SomaLeitor);
		leitor.close();
	}
}
