package lista2_lacos_de_decisao;

import java.util.Scanner;

//Faça um programa que receba três inteiros e diga qual deles é o maior.
public class ex1 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		int n1,n2,n3;

		System.out.print("Digite o 1º número inteiro: ");
		n1 = read.nextInt();
		System.out.print("Digite o 2º número inteiro: ");
		n2 = read.nextInt();
		System.out.print("Digite o 3º número inteiro: ");
		n3 = read.nextInt();

		if(n1 == n2 && n2 == n3) {
			System.out.println("Todos os números são iguais!");
		}
		if(n1 > n2 && n1 > n3) {
			System.out.println("O número " + n1 + " é o maior");
		}if(n2 > n1 && n2 > n3) {
			System.out.println("O número " + n2 + " é o maior");
		}if(n3 > n1 && n3 > n2) {
			System.out.println("O número " + n3 + " é o maior");
		}
		
		read.close();
	}

}
