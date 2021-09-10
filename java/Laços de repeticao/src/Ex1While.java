
import java.util.Scanner;

public class Ex1While {

	public static void main(String[] args) {

		int idade = 0, vinteEum = 0, cinquenta = 0;
		Scanner leitor = new Scanner(System.in);

		while (idade <= 99) {

			System.out.print("Digite a idade: ");
			idade = leitor.nextInt();

			if (idade <= 21) {
				vinteEum = vinteEum + 1;

			} else if (idade > 50 && idade <= 99) {
				cinquenta = cinquenta + 1;

			}
		}
		System.out.println("O total de pessoas com meos de 21 anos é de: " + vinteEum);
		System.out.print("O total de pessoas com mais de 50 anos é de: " + cinquenta);

		leitor.close();
	}

}
