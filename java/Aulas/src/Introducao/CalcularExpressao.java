package Introducao;
import java.util.Scanner;

public class CalcularExpressao {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);

		double a;
		double b;
		double c;
		double d;
		double r;
		double s;

		 System.out.print("Número A: \n");
		 a = leia.nextDouble();
		 
		 System.out.print("Número B: \n");
		 b = leia.nextDouble();

		 System.out.print("Número C: \n");
		 c = leia.nextDouble();
		 
		r = Math.pow((a + b),2.0);
		s = Math.pow((b + c),2.0);
		
		d = (r + s) / 2;
		
		System.out.println("R = "+r);
		System.out.println("\nD = "+d);
		System.out.println("\nS = "+s);
		leia.close();


	}

}
