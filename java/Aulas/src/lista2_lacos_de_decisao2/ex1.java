package lista2_lacos_de_decisao2;

import java.util.Scanner;

/* Jo�o, homem de bem, comprou um microcomputador para controlar o rendimento di�rio
de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
regulamento do estado de S�o Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo
excedente. Jo�o precisa que voc� fa�a um sistema que leia a vari�vel P (peso de tomates) e
verifique se h� excesso. Se houver, gravar na vari�vel E (Excesso) e na vari�vel M o valor
da multa que Jo�o dever� pagar. Caso contr�rio mostrar tais vari�veis com o conte�do
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
