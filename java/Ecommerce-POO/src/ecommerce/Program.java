package ecommerce;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		DAL dal = new DAL();
		Scanner sc = new Scanner(System.in);

		System.out.println("Deseja fazer uma compra? S/N");

		// String input
		String flag = sc.nextLine();
		while (flag.toLowerCase().equals("s")) {
			System.out.println(flag);
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
	}
}
