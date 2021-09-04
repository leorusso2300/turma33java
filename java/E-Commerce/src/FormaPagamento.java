import java.util.Scanner;

public class FormaPagamento {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		double valorTotal, valorNota = 0.0, valorParcela, valorCompra = 0.0, valorPagamento = 150.00;
		int formaPagamento, emitirNota = 0, fim = 0;

		System.out.println("Selecione a forma de pagamento?");
		System.out.println("\n1 - DÉBITO \n2 - CRÉDITO \n3 - PARCELADO (2X)");
		System.out.print("\nPagamento: ");
		formaPagamento = leitor.nextInt();

		if (formaPagamento == 1) {
			valorCompra = valorPagamento * (10.00 / 100.00);
			valorTotal = valorPagamento - valorCompra;
			valorNota = valorTotal * (9.00 / 100.00);
			System.out.printf("O valor total da compra é de: R$%.2f", valorTotal);
			System.out.println(" (Desconto de 10%)");

		} else if (formaPagamento == 2) {
			valorCompra = valorPagamento * (10.00 / 100.00);
			valorTotal = valorPagamento + valorCompra;
			valorNota = valorTotal * (9.00 / 100.00);
			System.out.printf("O valor total da compra é de: R$%.2f",valorTotal);
			System.out.println(" Acréscimo de 10%");


		} else if (formaPagamento == 3) {
			valorCompra = valorPagamento * (15.00 / 100.00);
			valorTotal = valorPagamento + valorCompra;
			valorNota = valorTotal * (9.00 / 100.00);
			System.out.printf("O valor total da compra é de: R$%.2f", valorTotal);

			valorParcela = valorTotal / 2;
			System.out.print("\nA conta totalizou 2 parcelas de: R$ " + valorParcela);

		}
		System.out.printf("\nO imposto é de R$%.2f:", valorNota);
		System.out.println(" (9%)");
		
		
		System.out.print("Deseja imitir nota? 1-SIM 2-NÃO");
		emitirNota = leitor.nextInt();
		
		if(emitirNota == 1) {
			
			//System.out.print("\n\n");
			//System.out.print("CARRINHO\n\n");
			//System.out.print ("COD\t  Produto \t   Valor\t    Qnt\n");
			//carrinho[x]= codigoProduto[x]+"\t"+nomeProduto[x]+"R$ "+(valorProduto[x]*qtaAdicionadoCarrinho[x])+"\t   "+qtaAdicionadoCarrinho[x]+"\n"
			//System.out.printf("Subtotal: R$ "+ totalFinal +"\t\t Valor da nota: R$ "+valorTotal);
			
			//for(int c=0; c<10; c++){
				//if(carrinho[c] != " "){
					//System.out.print (carrinho[c]);
					//total = valorProduto[x]*qtaAdicionadoCarrinho[x];
				////}
			
			}
			System.out.print(valorTotal);
			//System.out.print ("Subtotal: R$ "+totalFinal+"\t\t Valor da nota: R$ "+ valorTotal;	
			System.out.print("FINALIZAR COMPRA AGORA? (1) SIM ou (2) NÃO: \n");
			fim = leitor.nextInt();
			
		}
		
		
		
		leitor.close();
	}

}
