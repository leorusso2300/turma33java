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
		System.out.println("Qual o custo de f�brica?");
		custoDeFabrica = read.nextDouble();
		
		custoAoConsumidor = custoDeFabrica * 0.28;
		porcenDistribuidor = custoDeFabrica * 0.45;
		custoAoConsumidor = custoDeFabrica + porcenDistribuidor + porcenImpostos;
		System.out.printf("O custo ao consumidor �: %.2f",custoAoConsumidor);
		read.close();
	}

}
