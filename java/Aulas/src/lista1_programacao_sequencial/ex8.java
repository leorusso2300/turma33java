package lista1_programacao_sequencial;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {

		double custoDeFabrica;
		double porcenDistribuidor;
		double porcenImpostos;
		double custoAoConsumidor;
		
		Scanner read = new Scanner(System.in);
		custoDeFabrica = 0;
		porcenDistribuidor = 0;
		porcenImpostos = 0;
		custoAoConsumidor = 0;
		System.out.println("Qual o custo de fábrica?");
		custoDeFabrica = read.nextDouble();
		
		custoAoConsumidor = custoDeFabrica * 0.28;
		porcenDistribuidor = custoDeFabrica * 0.45;
		custoAoConsumidor = custoDeFabrica + porcenDistribuidor + porcenImpostos;
		System.out.println("------------------------------------");
		System.out.printf("O custo ao consumidor é: %.2f",custoAoConsumidor);
		System.out.println("\n------------------------------------");

		read.close();
	}

}
