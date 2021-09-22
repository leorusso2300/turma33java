package lista3_lacos_de_repeticao2;

import java.util.Scanner;

/*A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre
 *  o salário e número de filhos. A prefeitura deseja saber:   
a) média do salário da população; 
b) média do número de filhos; 
c) maior salário; 
d) percentual de pessoas com salário até R$100,00.  
*/

public class ex2 {
	public static void main(String[] args) {

		int filhos, totalFilhos = 0;
		int mediaFilhos = 0, somaCem = 0, porcenSalarioAteCem = 0;
		double mediaSalario = 0, maiorSalario = 0, salario = 0, totalSalario = 0;

		Scanner read = new Scanner(System.in);

		for (int x = 1; x <= 2; x++) {
			System.out.println("Pessoa " + x);

			System.out.print("Salário: ");
			salario = read.nextInt();

			System.out.print("Número de filhos: ");
			filhos = read.nextInt();

			totalFilhos = totalFilhos + filhos;
			totalSalario = totalSalario + salario;

			mediaFilhos = (totalFilhos / x);
			mediaSalario = (totalSalario / x);

			if (salario > maiorSalario) {
				maiorSalario = salario;
			}
			if (salario <= 100) {
				somaCem++;
			}
			porcenSalarioAteCem = (somaCem * 100) / x;

		}
		
		System.out.println("-------------------------------------------------------------");
		System.out.printf("A média do salário da população é de R$ %.2f", mediaSalario);
		System.out.println("\nA média de filhos da população é de " + mediaFilhos);
		System.out.printf("O maior salário é de %.2f", maiorSalario);
		System.out.println("\nO percentual de pessoas com salário até R$100 é de: " + porcenSalarioAteCem + "%");
		System.out.println("-------------------------------------------------------------");
		read.close();
	}

}
