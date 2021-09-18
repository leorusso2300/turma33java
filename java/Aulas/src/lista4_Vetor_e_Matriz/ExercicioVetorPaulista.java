package lista4_Vetor_e_Matriz;
import java.util.Scanner;


public class ExercicioVetorPaulista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner(System.in);

		int pontos[] = new int[4];
		int resultado;

		String times[] = { "São Paulo", "Corinthians", "Palmeiras", "Santos" };

		for (int rodada = 1; rodada < 4; rodada++) {
			System.out.println("Rodada " + rodada);

			for (int timeResultado = 0; timeResultado < 4; timeResultado++) {
				System.out.println("O time " + times[timeResultado] + "\n1-Ganhou 2-Perdeu 3-Empatou\n");
				resultado = leitor.nextInt();

				if (resultado == 1) {
					pontos[timeResultado] = pontos[timeResultado] + 3;
				} else if (resultado == 2) {
					pontos[timeResultado] = pontos[timeResultado] + 0;

				}else if (resultado == 3) {
					pontos[timeResultado] = pontos[timeResultado] + 1;

				}else {
					System.out.println("Opção inválida!");
				}

			}
		}
		
		System.out.println("------------------ Tabela ------------------");
		for(int x = 0; x < 4 ; x++) {
			System.out.println(times[x] + " " + pontos[x]);
		}
		System.out.println("--------------------------------------------");
		leitor.close();

	}

}
