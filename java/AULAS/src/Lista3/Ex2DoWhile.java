package Lista3;

import java.util.Scanner;

public class Ex2DoWhile {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		int numero = 0, multTres = 0, media = 0, soma = 0;

		do {

			System.out.print("Digite um número inteiro: ");
			numero = leitor.nextInt();

			if (numero % 3 == 0) {

				multTres = multTres + numero;
				soma = soma + 1;				
			}

		} while (numero != 0);

		media = (multTres / (soma - 1));
		System.out.print(soma);
		System.out.print("A média dos números multiplos de 3 é: " + media);
		leitor.close();

	}

}
