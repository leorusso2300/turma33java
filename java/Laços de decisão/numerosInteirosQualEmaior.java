package Lista2;

import java.util.Scanner;

public class numerosInteirosQualEmaior {

	public static void main(String[] args) {
		
		
		Scanner leitor = new Scanner(System.in);
		
		
		int n1,n2,n3;
		
		System.out.println("Digite o 1º número: ");
		n1 = leitor.nextInt();
		
		System.out.println("Digite o 2º número: ");
		n2 = leitor.nextInt();
		
		System.out.println("Digite o 3º número: ");
		n3 = leitor.nextInt();
		
		
		if(n1 > n2 && n1>n3) {
		System.out.println("O 1º número é o maior!");
		}else if(n2 > n1 && n2>n3) {
			System.out.println("O 2º número é o maior!");

		}else if(n3 > n1 && n3>n2) {
			System.out.println("O 3º número é o maior!");

		}			
		
		leitor.close();
	}

}
