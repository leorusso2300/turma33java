import java.util.Scanner;

public class FormaPagamento {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		double valorTotal, valorNota = 0.0, valorParcela, valorCompra = 0.0, valorPagamento = 150.00;
		int formaPagamento;

		System.out.println("Selecione a forma de pagamento?");
		System.out.println("\n1 - D�BITO \n2 - CR�DITO \n3 - PARCELADO (2X)");
		System.out.print("\nPagamento: ");
		formaPagamento = leitor.nextInt();

		if (formaPagamento == 1) {
			valorCompra = valorPagamento * (10.00 / 100.00);
			valorTotal = valorPagamento - valorCompra;
			valorNota = valorTotal * (9.00 / 100.00);
			System.out.printf("O valor total da compra � de: R$%.2f", valorTotal);
			System.out.println(" (Desconto de 10%)");

		} else if (formaPagamento == 2) {
			valorCompra = valorPagamento * (10.00 / 100.00);
			valorTotal = valorPagamento + valorCompra;
			valorNota = valorTotal * (9.00 / 100.00);
			System.out.printf("O valor total da compra � de: R$%.2f",valorTotal);
			System.out.println(" Acr�scimo de 10%");


		} else if (formaPagamento == 3) {
			valorCompra = valorPagamento * (15.00 / 100.00);
			valorTotal = valorPagamento + valorCompra;
			valorNota = valorTotal * (9.00 / 100.00);
			System.out.printf("O valor total da compra � de: R$%.2f", valorTotal);

			valorParcela = valorTotal / 2;
			System.out.print("\nA conta totalizou 2 parcelas de: R$ " + valorParcela);

		}
		System.out.printf("\nO imposto � de R$%.2f:", valorNota);
		System.out.println(" (9%)");
		leitor.close();
	}

}
