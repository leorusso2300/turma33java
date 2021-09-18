package lista4_Vetor_e_Matriz;
import java.util.Scanner;

/*
A) Crie um programa que receba valores do usu�rio 
para preencher uma matriz 3X3,

B) e em seguida,exiba a soma dos valores 

C) dela e a soma dos valores da 
primeira diagonal, ou seja, diagonal principal.
*/


public class Ex4_ValoresUsuario {

	public static void main(String[] args) {
		// vars
					Scanner read;
					int x;
					int y;
					int valores[][] = new int[3][3];
					int soma;
					int somaDiagonais;
					
					read = new Scanner(System.in);
					x = 0;
					y = 0;
					soma = 0;
					somaDiagonais = 0;
				// input or processing
					System.out.println("Insira os valores na matriz: ");
					while (x < 3)
					{
						while (y < 3) 
						{
							System.out.printf("Matriz[%d][%d]: ", x, y);
							valores[x][y] = read.nextInt();
							// somar cada n�mero que o usuario inserir!!	
							soma = soma + valores[x][y];
							// soma a diagonal principal
							if (x == y)
							{
								somaDiagonais = somaDiagonais + valores[x][y];
							}
							y++;
						}
						System.out.println();
						y = 0;
						x++;
					}
				// output
					x = 0;
					y = 0;
					System.out.println("Os valores inseridos pelo usu�rio s�o: ");
					while (x < 3)
					{
						while (y < 3) 
						{
							System.out.print(valores[x][y] + " ");
							y++;
						}
						System.out.println();
						y = 0;
						x++;
					}
					System.out.println("A soma de todos os valores �: " + soma);
					System.out.println("A soma da Diagonal Principal �: " + somaDiagonais);
					read.close();
			}

	}


