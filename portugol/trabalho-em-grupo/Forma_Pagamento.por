programa
{
	
	funcao inicio()
	{

	real valorTotal, valorNota = 0.0, valorParcela, valorCompra = 0.0, valorPagamento = 150.00
	inteiro formaPagamento
	

	escreva("Selecione a forma de pagamento?\n")
	escreva("\n1 - DEBITO \n2 - CREDITO \n3 - PARCELADO (2X)")
	escreva("\nPagamento: ")
	leia(formaPagamento)
	limpa()

	se(formaPagamento ==1) {
		valorCompra = valorPagamento * (10.00/100.00)
		valorTotal = valorPagamento - valorCompra
		valorNota = valorTotal * (9.00/100.00)
		escreva("O valor total da compra é de: R$ " ,valorTotal, " (Desconto 10%)	")
		
		
	
	} senao se(formaPagamento ==2){
		valorCompra = valorPagamento * (10.00/100.00)
		valorTotal = valorPagamento + valorCompra
		valorNota = valorTotal * (9.00/100.00)
		escreva("O valor total da compra é de: R$ " ,valorTotal, " (Acréscimo 10%)")
	
	} senao se(formaPagamento ==3){
		valorCompra = valorPagamento * (15.00/100.00)
		valorTotal = valorPagamento + valorCompra
		valorNota = valorTotal * (9.00/100.00)
		escreva(valorTotal)

		valorParcela = valorTotal / 2
		escreva("\nA conta totalizou 2 parcelas de: R$ " ,valorParcela)

	}
		escreva("\nO imposto é de: " ,valorNota, " (9%) ")
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 991; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */