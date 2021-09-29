package lista2_lacos_de_decisao2;

import java.util.Scanner;

/*Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
Adultos = Maiores de 18 anos
*/

public class ex6 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		int idade = 0;

		System.out.print("Digite a idade do nadador: ");
		idade = read.nextInt();

		System.out.println("------------");
		if (idade >= 5 && idade <= 7) {
			System.out.println("Infantil A");
		} else if (idade >= 8 && idade <= 11) {
			System.out.println("Infantil B");

		} else if (idade >= 12 && idade <= 13) {
			System.out.println("Juvenil A");

		} else if (idade >= 14 && idade <= 17) {
			System.out.println("Juvenil B");

		} else if (idade >= 18) {
			System.out.println("Adulto");

		}
		System.out.println("------------");
		read.close();

	}

}
