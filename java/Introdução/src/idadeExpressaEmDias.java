import java.util.Scanner;

public class idadeExpressaEmDias {
	
	
	public static void main(String [] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		int anos,meses,dias;
		int totalAnos,totalMeses,somaTotal;
		
		System.out.print("Digite sua idade em anos: ");
		anos = leia.nextInt();
		
		System.out.print("Digite sua idade em meses: ");
		meses = leia.nextInt();
		
		System.out.print("Digite sua idade em dias: ");
		dias = leia.nextInt();
		
		
		totalAnos = anos * 365;
		totalMeses = meses * 30;
		somaTotal = (totalAnos + totalMeses + dias);
		
		System.out.print("O tatal de dias é de: " + somaTotal);

		
		leia.close();

	}

}
