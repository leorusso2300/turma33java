package lista2_lacos_de_decisao;

import java.util.Scanner;

//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
public class ex1 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		int n1,n2,n3;

		System.out.print("Digite o 1� n�mero inteiro: ");
		n1 = read.nextInt();
		System.out.print("Digite o 2� n�mero inteiro: ");
		n2 = read.nextInt();
		System.out.print("Digite o 3� n�mero inteiro: ");
		n3 = read.nextInt();

		if(n1 == n2 && n2 == n3) {
			System.out.println("Todos os n�meros s�o iguais!");
		}
		if(n1 > n2 && n1 > n3) {
			System.out.println("O n�mero " + n1 + " � o maior");
		}if(n2 > n1 && n2 > n3) {
			System.out.println("O n�mero " + n2 + " � o maior");
		}if(n3 > n1 && n3 > n2) {
			System.out.println("O n�mero " + n3 + " � o maior");
		}
		
		read.close();
	}

}
