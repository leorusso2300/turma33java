package exercicio1;

public class Principal {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();

		cliente1.name = "Ana";
		cliente1.idade = 27;
		cliente1.cpf = "475.341.566-24";
		cliente1.negativado = true;

		Cliente cliente2 = new Cliente();

		cliente2.name = "leozinho";
		cliente2.idade = 29;
		cliente2.cpf = "475.348.566-26";
		cliente2.negativado = false;

		if (cliente1.negativado == true) {
			System.out.println(cliente1.name);
			System.out.println("Esse cliente está positivo");
		} else if (cliente1.negativado == false) {
			System.out.println(cliente1.name);
			System.out.println("Esse cliente está negativado!");
		}
		
		System.out.println("------------------------------");

		if (cliente2.negativado == true) {
			System.out.println(cliente2.name);
			System.out.println("Esse cliente está positivo");
		} else if (cliente2.negativado == false) {
			System.out.println(cliente1.name);
			System.out.println("Esse cliente está negativado!");
		}

	}
}
