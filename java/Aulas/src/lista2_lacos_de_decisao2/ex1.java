package lista2_lacos_de_decisao2;

import java.util.Scanner;

/* João, homem de bem, comprou um microcomputador para controlar o rendimento diário
de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
regulamento do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo
excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates) e
verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor
da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo
ZERO.
*/

public class ex1 {

	public static void main(String[] args) {

		int P, E = 0;
		double M = 0;
		Scanner read = new Scanner(System.in);

		System.out.print("Digite o peso do tomate: ");
		P = read.nextInt();

		if (P > 50) {
			E = (P - 50);
			M = (P - 50) * 4;

			System.out.println("-------------------------------------------");
			System.out.println("Peso excedido: " + E + "KG.");
			System.out.printf("Valor da multa: R$ %.2f%s", M, ".");
			System.out.println("\n-------------------------------------------");
		} else {

			System.out.println("-------------------------------------------");
			System.out.println("Peso excedido: " + E + "KG.");
			System.out.printf("Valor da multa: R$ %.2f%s", M, ".");
			System.out.println("\n-------------------------------------------");

		}

		read.close();

	}

}
