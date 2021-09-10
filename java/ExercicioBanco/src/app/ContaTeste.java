package app;

import entities.ContaCorrente;

public class ContaTeste {

	public static void main(String[] args) {

		ContaCorrente cliente1 = new ContaCorrente(370, "111.111.111-28", 0);
		cliente1.credito(500);
		cliente1.pediTalao(4);
		System.out.println(cliente1.toString());

	}
}
