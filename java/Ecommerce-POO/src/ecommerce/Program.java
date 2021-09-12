package ecommerce;

import java.util.Scanner;

public class Program {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		DAL dal = new DAL();

		System.out.println("Deseja fazer uma compra? S/N");
		String flag = sc.nextLine();

		while (flag.toLowerCase().equals("s")) {
			if (flag.toLowerCase().equals("s")) {
				dal.exibeProdutosDisponiveis();
				String id = sc.nextLine();
				dal.previewProduto(id);
				System.out.println("\nDigite a quantidade necessária\n");
				int quantidade = Integer.parseInt(sc.nextLine());

				dal.addProductCarrinho(id, quantidade);
				dal.exibeProdutosCarrinho();
				System.out.println("\nDeseja continuar a compra? S/N");
				flag = sc.nextLine();

			}

		}

		if (flag.toLowerCase().equals("n")) {
			System.out.println("Até breve!");
		} else if (!flag.toLowerCase().equals("n") || !flag.toLowerCase().equals("s")) {
			System.out.println("Por favor, digite somente 'S' ou 'N'!");

		}
		sc.close();

	}

}
