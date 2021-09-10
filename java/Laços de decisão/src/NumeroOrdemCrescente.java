import java.util.Scanner;

public class NumeroOrdemCrescente {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int n1, n2, n3;

		System.out.println("Digite o 1º número: ");
		n1 = leitor.nextInt();

		System.out.println("Digite o 2º número: ");
		n2 = leitor.nextInt();

		System.out.println("Digite o 3º número: ");
		n3 = leitor.nextInt();

		if (n1 == n2 && n2 == n3) {
			System.out.println("Todos os números são iguais");
		} else if (n1 >= n2 && n2 >= n3) {
			System.out.println("Os números em ordem crescente ficaram assim: " + n3 + " " + n2 + " " + n1);
		} else if (n1 >= n3 && n3 >= n2) {
			System.out.println("Os números em ordem crescente ficaram assim: " + n2 + " " + n3 + " " + n1);
		} else if (n2 >= n1 && n1 >= n3) {
			System.out.println("Os números em ordem crescente ficaram assim: " + n3 + " " + n1 + " " + n2);
		} else if (n2 >= n3 && n3 >= n1) {
			System.out.println("Os números em ordem crescente ficaram assim: " + n1 + " " + n3 + " " + n2);
		} else if (n3 >= n1 && n1 >= n2) {
			System.out.println("Os números em ordem crescente ficaram assim: " + n2 + " " + n1 + " " + n3);
		} else if (n3 >= n1 && n2 >= n1) {
			System.out.println("Os números em ordem crescente ficaram assim: " + n1 + " " + n2 + " " + n3);
		}

		leitor.close();
	}
}
