package Introducao;
import java.util.Scanner;

public class fahrenheit {

	
	public static void main(String [] args) {
		
		
		Scanner leia = new Scanner(System.in);

		
		String nome;
		double fahrenheit ;
		
		
		System.out.print("Digite seu nome:");
		nome = leia.next();
		
		System.out.print("Digite a temperatura em fahrenheit: ");
		fahrenheit  = leia.nextDouble();
		

		
		
		System.out.print("Olá " + nome + " a temperatura em Celsius é: " + (fahrenheit - 32) *5/9);


		leia.close();

	}
}
