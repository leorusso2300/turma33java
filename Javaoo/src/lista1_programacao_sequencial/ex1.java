package lista1_programacao_sequencial;

/*Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.
*/
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		int idadeEmAnos;
		int idadeEmMeses;
		int idadeEmDias;

		System.out.print("Idade: ");
		idadeEmAnos = read.nextInt();

		System.out.print("Meses: ");
		idadeEmMeses = read.nextInt();

		System.out.print("Dias: ");
		idadeEmDias = read.nextInt();

		idadeEmAnos = (idadeEmAnos * 365);
		idadeEmMeses = (idadeEmMeses * 30);

		System.out.print("Sua idade em dias é: " + (idadeEmAnos + idadeEmMeses + idadeEmDias));
		read.close();

	}

}
