import java.util.Scanner;

public class CategoriaIdade {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int idade;

		System.out.println("Digite a sua idade:  ");
		idade = leitor.nextInt();

		if (idade >= 10 && idade <= 14) {

			System.out.println("10-14 infantil");

		}else if (idade >= 15 && idade <= 17) {

			System.out.println("15-17 Juvenil");

		}else if (idade >= 18) {

			System.out.println("18> Adulto");

		}
		
		leitor.close();
	}

}
