package Lista1;
import java.util.Scanner;

public class EventoHorasMinutosSegundos {

	public static void main(String[] args) {

		
		Scanner leia = new Scanner(System.in);
		
		int evento, horas, minutos,segundos;
			
		System.out.print("Digite a duração evento em segundos: ");	
		evento = leia.nextInt();
		
		horas = (evento / 3600);
		minutos = (evento % 3600) / 60;
		segundos = (evento % 3600) % 60;
		
		
		
		System.out.print("O evento tem " + horas + " horas " + minutos + " minutos " + segundos + " segundos");	
		
		leia.close();

	}

}
