package lista4_Vetor_e_Matriz;
/*
1) Fa�a um programa que crie um vetor por leitura com 5
valores de pontua��o de uma atividade e o escreva em seguida.
Encontre ap�s a maior pontua��o e a apresente. 
*/


import java.util.Scanner;

public class Ex1_DigiteCincoValores {

	public static void main(String[] args) {

		double maiorNota;
		double valores[] = new double[5];
		int i;

		Scanner read = new Scanner(System.in);
		maiorNota = 0;
		i = 0;
		System.out.println("Digite as notas das Provas:");
		while (i < 5) {
			System.out.println("Nota " + (i + 1) + " : ");
			valores[i] = read.nextDouble();
			if (valores[i] > maiorNota)
				maiorNota = valores[i];
			i++;
		}
		
		System.out.println("A maior nota foi: " + (int) maiorNota);
		read.close();

	}

}
