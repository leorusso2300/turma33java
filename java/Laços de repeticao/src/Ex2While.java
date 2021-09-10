

import java.util.Scanner;

public class Ex2While {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int idade = 0, sexo = 0, pessoa = 1, calma = 0, numeroPessoasCalmas = 0;
		int numeroMulheresNervosas = 0, numeroHomemAgressivo = 0, numeroPessoasQuarenta = 0,
				numeroPessoasCalmasMenos = 0, numeroOutrosCalmos = 0;
		while (pessoa <= 2) {

			for (pessoa = 1; pessoa <= 3; pessoa++) {

				System.out.println("Pessoa " + pessoa);
				System.out.println("Digite a Sexo: (1-Masculino / 2-Feminino / 3-Outros) ");
				sexo = leitor.nextInt();

				System.out.println("Digite a idade: ");
				idade = leitor.nextInt();

				System.out.println("Essa pessoa é: \n1-Calma\n2-Nervosa\n3-Agressiva");
				calma = leitor.nextInt();

				if (calma == 1) {
					numeroPessoasCalmas = numeroPessoasCalmas + 1;
				}
				if (sexo == 3) {
					numeroOutrosCalmos = numeroOutrosCalmos + 1;
				}
				if (sexo == 2 && calma == 2) {
					numeroMulheresNervosas = numeroMulheresNervosas + 1;
				} if (sexo == 1 && calma == 3) {
					numeroHomemAgressivo = numeroHomemAgressivo + 1;
				} if (idade > 40 && calma == 2) {
					numeroPessoasQuarenta = numeroPessoasQuarenta + 1;
				} if (idade < 18 && calma == 1) {
					numeroPessoasCalmasMenos = numeroPessoasCalmasMenos + 1;
				}

				System.out.println("################");

			}
		}

		System.out.println("Número de pessoas calmas: " + numeroPessoasCalmas);
		System.out.println("Número de mulheres nervosas: " + numeroMulheresNervosas);
		System.out.println("Número de homens agressivos: " + numeroHomemAgressivo);
		System.out.println("Número de outros calmas: " + numeroOutrosCalmos);
		System.out.println("Número de pessoas nervosas acima de 40 anos: " + numeroPessoasQuarenta);
		System.out.println("Número de pessoas calmas com menos de 18: " + numeroPessoasCalmasMenos);

	}

}
