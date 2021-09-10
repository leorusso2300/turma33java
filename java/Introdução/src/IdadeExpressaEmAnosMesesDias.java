import java.util.Scanner;

public class IdadeExpressaEmAnosMesesDias {

	public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
		
	int idadeDias,anos,meses,dias;
		
	System.out.print("Digite sua idade em dias :");	
	idadeDias = leia.nextInt();
	
	anos = (idadeDias / 365);
	meses = (idadeDias % 365) / 30;
	dias = (idadeDias % 365) % 30;
	
	System.out.print("Você tem " + anos + " ano(s)\n" + meses + " mes(es)\n" + dias + " dia(s)");
	leia.close();


	}

}
