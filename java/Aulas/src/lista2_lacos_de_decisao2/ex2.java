package lista2_lacos_de_decisao2;

import java.util.Scanner;


/*Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
excedente.
*/

public class ex2 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		int c;
		double n, excessoHoras, salarioTotal;
		double salarioExcedente;
		System.out.print("Código do fúncionario: ");
		c = read.nextInt();

		System.out.print("Número de horas trabalhadas: ");
		n = read.nextInt();

		if (n > 50) {
			excessoHoras = n - 50;
			salarioExcedente = (excessoHoras * 20);

			salarioTotal = (50 * 10);
			System.out.println("---------------------------------------");	
			System.out.println("Código funcionário: " + c);	
			System.out.printf("Salário excedente: R$%.2f", salarioExcedente);
			System.out.printf("\nSalário total: R$%.2f", (salarioExcedente + salarioTotal));
			System.out.println("\n---------------------------------------");

		} else if (n <= 50) {
			salarioTotal = (n * 10);
			System.out.println("---------------------------------------");	
			System.out.println("Código funcionário: " + c);	
			System.out.printf("Salário total: R$%.2f", salarioTotal);
			System.out.println("\n---------------------------------------");

		}

		read.close();

	}

}
