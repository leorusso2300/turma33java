package ExerciciosPOO;

public class AviaoPrincipal {

	public static void main(String[] args) {

		Aviao aviao1 = new Aviao();
		aviao1.aviaoNome = "Leonardo";
		aviao1.ligado = true;
		
		Aviao aviao2 = new Aviao();
		aviao2.aviaoNome = "Leonardo";
		aviao2.ligado = false;

		if (aviao1.ligado == true) {
			System.out.println("O avi�o " + aviao1.aviaoNome + " est� ligado");
		}else {
			System.out.println("O avi�o " + aviao1.aviaoNome + " est� desligado");

		}
		
		if (aviao2.ligado == true) {
			System.out.println("O avi�o " + aviao2.aviaoNome + " est� ligado");
		}else {
			System.out.println("O avi�o " + aviao2.aviaoNome + " est� desligado");

		}
	}

}
