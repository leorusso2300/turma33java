package lista1_programacao_sequencial;

import java.util.Scanner;

/*Fa?a um sistema que leia o tempo de dura??o de um evento em uma f?brica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.
*/

public class ex3 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		int tempoEmMinutos;
		int tempoEmHoras;
		int duracaoEvento;
		int tempoEmSegundos;
		System.out.print("Digite a dura??o do evento em segundo: ");
		duracaoEvento = read.nextInt();

		tempoEmHoras = (duracaoEvento / 3600);
		tempoEmMinutos = (duracaoEvento % 3600) / 60;
		tempoEmSegundos = (duracaoEvento % 60) % 60;

		System.out.println("-------------------------");
		System.out.println("O evento tem " + tempoEmHoras + " horas.");
		System.out.println(tempoEmMinutos + " minutos");
		System.out.println(tempoEmSegundos + " segundos");
		System.out.println("-------------------------");

		read.close();
	}

}
