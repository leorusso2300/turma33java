package exercicio2;

public class Principal {

	public static void main(String[] args) {

		Aviao aviao1 = new Aviao();

		aviao1.empresa = "TAM";
		aviao1.cor = "Rosa";
		aviao1.destino = "Bora-Bora";
		aviao1.tanque = 20;

		// Aviso que precisa abastecer!
		if (aviao1.tanque < 50) {
			System.out.println("O avi�o da empresa " + aviao1.empresa + ", com destino a " + aviao1.destino
					+ " precisa abastecer..");
			System.out.println("Tem apenas " + aviao1.tanque + " litros de querosene");
		}
	}

}
