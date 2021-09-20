package lista3_lacos_de_repeticao;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int contador = 1;
		int idade;
		int sexo;
		int temperamento;

		int pessoasCalmas = 0, mulheresNervosas = 0, homensAgressivos = 0;
		int pessoaQuarenta = 0, pessoaDezoito = 0, outrosCalmos = 0;

		while (contador <= 5) {

			contador++;
			System.out.printf("Pessoa " + (contador - 1));
			System.out.println("\nQual a idade?");
			idade = read.nextInt();

			System.out.println("Qual o sexo? (1-Masculino 2-Feminino 3-Outros)");
			sexo = read.nextInt();

			System.out.println("Essa pessoa é:\n1-Calma\n2-Nervosa\n3-Agressiva");
			temperamento = read.nextInt();

			System.out.println("-----------------------------------------------");

			if (temperamento == 1) {
				pessoasCalmas++;
			}
			if (sexo == 2 && temperamento == 2) {
				mulheresNervosas++;
			}
			if (sexo == 1 && temperamento == 3) {
				homensAgressivos++;
			}
			if (sexo == 3) {
				outrosCalmos++;
			}
			if (idade > 40) {
				pessoaQuarenta++;
			}
			if (idade < 18) {
				pessoaDezoito++;
			}

		}
		
		System.out.println("O número de pessoas calmas é: " + pessoasCalmas);
		System.out.println("O número de mulheres nervosas é: " + mulheresNervosas);
		System.out.println("O número de homens agressivos é: " + homensAgressivos);
		System.out.println("O número de outros calmos é: " + outrosCalmos);
		System.out.println("O número de pessoas nervosas com mais de 40 é: " + pessoaQuarenta);
		System.out.println("O número de pessoas calmas com menos de 18 é: " + pessoaDezoito);
		System.out.println("\n-----------------------------------------------");
		read.close();
		
		


	}
}
