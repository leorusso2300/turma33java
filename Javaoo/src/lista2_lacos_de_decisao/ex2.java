package lista2_lacos_de_decisao;



//Faça um programa que entre com três números e coloque em ordem crescente.



import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		int n1, n2, n3;

		System.out.print("Digite o 1º número: ");
		n1 = read.nextInt();

		System.out.print("Digite o 2º número: ");
		n2 = read.nextInt();

		System.out.print("Digite o 3º número: ");
		n3 = read.nextInt();

		if (n1 == n2 && n2 == n3) {
			System.out.println("Todos os números são iguais!");
		} else {
			if (n1 > n2 && n2 > n3) {
				System.out.println(n3 + " " + n2 + " " + n1);
			} else if (n1 > n3 && n3 > n2) {
				System.out.println(n2 + " " + n3 + " " + n1);
			} else if (n2 > n1 && n1 > n3) {
				System.out.println(n3 + " " + n1 + " " + n2);

			} else if (n2 > n3 && n3 > n1) {
				System.out.println(n1 + " " + n3 + " " + n2);
			} else if (n3 > n1 && n1 > n2) {
				System.out.println(n2 + " " + n1 + " " + n3);
			} else if (n3 > n2 && n2 > n1) {
				System.out.println(n1 + " " + n2 + " " + n3);
			}

			read.close();
		}
	}

}
