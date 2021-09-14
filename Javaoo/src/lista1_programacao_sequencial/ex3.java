package lista1_programacao_sequencial;
/*Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.
*/

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		int tempoEmMinutos;
		int tempoEmHoras;
		int duracaoEvento;
		int tempoEmSegundos;
		System.out.print("Digite a duração do evento em segundo: ");
		duracaoEvento = read.nextInt();

		tempoEmHoras = (duracaoEvento / 3600);
		tempoEmMinutos = (duracaoEvento % 3600) / 60;
		tempoEmSegundos = (duracaoEvento % 60) % 60;

		System.out.println("O evento tem " + tempoEmHoras + " horas.");
		System.out.println(tempoEmMinutos + " minutos");
		System.out.print(tempoEmSegundos + " segundos");

		read.close();
	}

}
