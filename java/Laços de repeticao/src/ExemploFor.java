public class ExemploFor {

	public static void main(String[] args) {

		double soma = 0.00;

		for (int x = 1; x <= 500; x++) {
			if ((x % 2) == 1 && (x % 3) == 0) {
				
				System.out.println(x);
				soma = (soma + x);

			}

		}
		System.out.println(soma);
	}

}
