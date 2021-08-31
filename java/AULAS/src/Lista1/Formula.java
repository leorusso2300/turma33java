package Lista1;
import java.util.Scanner;

public class Formula {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);

		
		double x1;
		double x2;
		double y1;
		double y2;
		double d;

		System.out.print("x1: ");
		x1 = leia.nextDouble();
		
		System.out.print("x2: ");
		x2 = leia.nextDouble();
		
		System.out.println("y1: ");
		y1 = leia.nextDouble();

		System.out.println("y2: ");
		y2 = leia.nextDouble();
		
		
		d = Math.sqrt((Math.pow((x2 - x1),2)) + (Math.pow((y2 - y1),2)));
		System.out.println("A distância entre os pontos: " + d);
		
		leia.close();
	}

}
