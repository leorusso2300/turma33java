import java.util.Scanner;

public class OiMundo {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String nome;
		int anoNascimento;
		int anoAtual = 2021;

		System.out.println("Olá Mundo, turma 33!");

		System.out.print("Digite seu nome: ");
		nome = leia.next();

		System.out.print("Digite o ano do seu Nascimento: ");
		anoNascimento = leia.nextInt();

		System.out.println("Olá " + nome + ", sua idade é " + (anoAtual - anoNascimento) + " anos");
		leia.close();
	}

}
