package Lista1;
import java.util.Scanner;

public class NotaMediaPond {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		double n1,n2,n3, media, mediapond;

		System.out.println("Nota 1: ");
		n1 = leia.nextDouble();
		System.out.println("Nota 2: ");
		n2 = leia.nextDouble();
		System.out.println("Nota 3: ");
		n3 = leia.nextDouble();

		media = (n1 * 2) + (n2*3) + (n3) * 5;
		mediapond = media/10;

		System.out.println("A média é: " + mediapond);
		leia.close();

	}

}
