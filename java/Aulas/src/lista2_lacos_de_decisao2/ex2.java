package lista2_lacos_de_decisao2;

import java.util.Scanner;


/*Elabore um sistema que leia as vari�veis C e N, respectivamente c�digo e n�mero de
horas trabalhadas de um oper�rio. E calcule o sal�rio sabendo-se que ele ganha R$ 10,00
por hora. Quando o n�mero de horas exceder a 50 calcule o excesso de pagamento
armazenando-o na vari�vel E, caso contr�rio zerar tal vari�vel. A hora excedente de
trabalho vale R$ 20,00. No final do processamento imprimir o sal�rio total e o sal�rio
excedente.
*/

public class ex2 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		int c;
		double n, excessoHoras, salarioTotal;
		double salarioExcedente;
		System.out.print("C�digo do f�ncionario: ");
		c = read.nextInt();

		System.out.print("N�mero de horas trabalhadas: ");
		n = read.nextInt();

		if (n > 50) {
			excessoHoras = n - 50;
			salarioExcedente = (excessoHoras * 20);

			salarioTotal = (50 * 10);
			System.out.println("---------------------------------------");	
			System.out.println("C�digo funcion�rio: " + c);	
			System.out.printf("Sal�rio excedente: R$%.2f", salarioExcedente);
			System.out.printf("\nSal�rio total: R$%.2f", (salarioExcedente + salarioTotal));
			System.out.println("\n---------------------------------------");

		} else if (n <= 50) {
			salarioTotal = (n * 10);
			System.out.println("---------------------------------------");	
			System.out.println("C�digo funcion�rio: " + c);	
			System.out.printf("Sal�rio total: R$%.2f", salarioTotal);
			System.out.println("\n---------------------------------------");

		}

		read.close();

	}

}
