package lista3_lacos_de_repeticao2;

import java.util.Scanner;

/*ler nomeDeUmAluno
qual o seu pronome?
ler nota1-5
mostrar a m�dia
estado de aprova��o
> 5 aprovado
<= 5 recupera��o
*/

public class ex1 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		String nome;
		int pronome, n1, n2, n3;
		int notas = 3;
		int media = 0;

		System.out.println("Qual o nome do aluno?");
		nome = read.next();

		System.out.println("Qual o seu pronome?\n1-Ele\n2-Ela\n3-Elu");
		pronome = read.nextInt();

		while (notas <= 3) {

			System.out.println("Digite 1� nota: ");
			n1 = read.nextInt();

			System.out.println("Digite 2� nota: ");
			n2 = read.nextInt();

			System.out.println("Digite 3� nota: ");
			n3 = read.nextInt();
			notas++;

			media = (n1 + n2 + n3) / 3;
			
			System.out.println("----------------------------------------------------------------");
			if (pronome == 1) {
				if (media > 5) {
					System.out.println("A m�dia das notas do aluno " + nome + " � " + media + ". Ele foi aprovado.");
				} else if (media <= 5) {
					System.out.println("A m�dia das notas do aluno " + nome + " � " + media + ". Ele foi reprovado.");

				}
			} else if (pronome == 2) {
				if (media > 5) {
					System.out.println("A m�dia das notas da aluna " + nome + " � " + media + ". Ela foi aprovada.");
				} else if (media <= 5) {
					System.out.println("A m�dia das notas da aluna " + nome + " � " + media + ". Ela ela foi reprovada.");

				}
			} else if (pronome == 3) {
				if (media > 5) {
					System.out.println("A m�dia das notas de alune " + nome + " � " + media + ". Elu foi aprovade.");
				} else if (media <= 5) {
					System.out.println("A m�dia das notas de alune " + nome + " � " + media + ". Elu foi reprovade.");

				}
			}
			
			System.out.println("----------------------------------------------------------------");


		}
		read.close();

	}

}
