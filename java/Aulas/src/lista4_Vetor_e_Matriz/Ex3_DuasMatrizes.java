package lista4_Vetor_e_Matriz;
import java.util.Scanner;

/*
 
Escreve um programa que l� duas matrizes N1 (4,6) e N2(4,6) e cria:

Uma matriz M1 cujos elementos ser�o as somas dos elementos 
de mesma posi��o das matrizes N1 e N2;

Uma matriz M2 cujos elementos ser�o as diferen�as dos elementos 
de mesma posi��o das matrizes N1 e N2.

*/

public class Ex3_DuasMatrizes {

	public static void main(String[] args) {

				Scanner read;
				int N1[][] = new int[4][6];
				int N2[][] = new int[4][6];
				int M1[][] = new int[4][6];
				int M2[][] = new int[4][6];
				int x;
				int y;
				
				x = 0;
				y = 0;
				read = new Scanner(System.in);
			// input
				// Ler matriz N1
				System.out.println("Digite os valores da matriz N1:");
				
				while (x < 4)
				{
					while (y < 6)
					{
						System.out.printf("N1[%d][%d]: ", x, y);
						N1[x][y] = read.nextInt();
						y++;
					}
					System.out.println();
					y = 0;
					x++;
				}
				// Ler matriz N2
					x = 0;
					y = 0;
					System.out.println("Digite os valores da matriz N2:");
					
					while (x < 4)
					{
						while (y < 6)
						{
							System.out.printf("N2[%d][%d]: ", x, y);
							N2[x][y] = read.nextInt();
							y++;
						}
						System.out.println();
						y = 0;
						x++;
					}		
			// processing e output		
					// M1
						x = 0;
						y = 0;
						System.out.println("\nM1 (N1 + n1)\n");				
						while (x < 4)
						{
							while (y < 6)
							{
								M1[x][y] = N1[x][y] + N2[x][y];
								System.out.print(M1[x][y] + " ");
								y++;
							}
							System.out.println();
							y = 0;
							x++;
						}
						System.out.print("\n");
					// M2
						x = 0;
						y = 0;
						System.out.println("\nM2 (N1 - n1)\n");				
						while (x < 4)
						{
							while (y < 6)
							{
								M2[x][y] = N1[x][y] - N2[x][y];
								System.out.print(M2[x][y] + " ");
								y++;
							}
							System.out.println();
							y = 0;
							x++;
						}
				read.close();
		
	}

}
