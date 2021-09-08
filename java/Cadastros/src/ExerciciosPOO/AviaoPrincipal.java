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
			System.out.println("O avião " + aviao1.aviaoNome + " está ligado");
		}else {
			System.out.println("O avião " + aviao1.aviaoNome + " está desligado");

		}
		
		if (aviao2.ligado == true) {
			System.out.println("O avião " + aviao2.aviaoNome + " está ligado");
		}else {
			System.out.println("O avião " + aviao2.aviaoNome + " está desligado");

		}
	}

}
