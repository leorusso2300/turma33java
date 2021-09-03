package Lista4;

import java.util.Scanner;
import java.util.Random;

public class Ex1Matriz {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Random gerador = new Random();
		int[][] Matriz = new int[3][3];
		int somaMatriz = 0, somaDiagonal = 0;
		for (int linha = 0; linha < 3; linha++) {

			for (int coluna = 0; coluna < 3; coluna++) {
				Matriz[linha][coluna] = gerador.nextInt(50);
				somaMatriz = somaMatriz + Matriz[linha][coluna];
				if (linha == coluna) {
					somaDiagonal = somaDiagonal + Matriz[linha][coluna];
				}
			}
		}
		System.out.println("A soma da matriz :" + somaMatriz);
		System.out.println("A soma da diagonal :" + somaDiagonal);
		leia.close();

	}
}
