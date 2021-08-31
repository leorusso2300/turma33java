// Loja DevShoes 
// Integrantes: Matheus, Paulo, Larissa, Fernando, Beatriz e Leonardo.
// ###### GENERATION BRASIL 2021 TURMA 33 #######
// SISTEMA QUE SIMULA UM E-COMMERCE



programa{
	inclua biblioteca Util

	funcao inicio(){
		
		//vetor - produto
		cadeia nomeProduto[10]
		nomeProduto[0] = "Tênis Nike        "
		nomeProduto[1] = "Tênis Adidas      "
		nomeProduto[2] = "Tênis Puma        "
		nomeProduto[3] = "Camisa Nike       "
		nomeProduto[4] = "Camisa Lacoste    "
		nomeProduto[5] = "Camisa Supreme    "
		nomeProduto[6] = "Meia Nike         "
		nomeProduto[7] = "Meia Adidas       "
		nomeProduto[8] = "Bola de futebol   "  
		nomeProduto[9] = "Blusa moleton Nike"

          //vetor - código do produto
          cadeia codigoProduto[10], codigoEscolhido="x"
		codigoProduto [0] = "G2-1"
		codigoProduto [1] = "G2-2"	
		codigoProduto [2] = "G2-3"
		codigoProduto [3] = "G2-4"
		codigoProduto [4] = "G2-5"
		codigoProduto [5] = "G2-6"
		codigoProduto [6] = "G2-7"
		codigoProduto [7] = "G2-8"
		codigoProduto [8] = "G2-9"
		codigoProduto [9] = "G2-10"

		//vetor - Carrinho
		cadeia carrinho[10]
		carrinho[0] = " "
		carrinho[1] = " "
		carrinho[2] = " "
		carrinho[3] = " "
		carrinho[4] = " "
		carrinho[5] = " "
		carrinho[6] = " "
		carrinho[7] = " "
		carrinho[8] = " "
		carrinho[9] = " "
		
		//vetor - Adicionado ao Carrinho
		inteiro qtaAdicionadoCarrinho[10]
		qtaAdicionadoCarrinho[0] = 0
		qtaAdicionadoCarrinho[1] = 0
		qtaAdicionadoCarrinho[2] = 0
		qtaAdicionadoCarrinho[3] = 0
		qtaAdicionadoCarrinho[4] = 0
		qtaAdicionadoCarrinho[5] = 0
		qtaAdicionadoCarrinho[6] = 0
		qtaAdicionadoCarrinho[7] = 0
		qtaAdicionadoCarrinho[8] = 0
		qtaAdicionadoCarrinho[9] = 0
		
		//vetor - valor do produto
		inteiro valorProduto[10] = {200, 150, 100, 50, 500, 1000, 30, 25, 40, 120 }
          
          //vetor - estoque do produto
          inteiro estoqueProduto[10]
          estoqueProduto[0] = 10
		estoqueProduto[1] = 10
		estoqueProduto[2] = 10
		estoqueProduto[3] = 10
		estoqueProduto[4] = 10
		estoqueProduto[5] = 10
		estoqueProduto[6] = 10
		estoqueProduto[7] = 10
		estoqueProduto[8] = 10
		estoqueProduto[9] = 10
		
		//VARIAVEIS ********************************************
		inteiro x=0 
		caracter valor, s = 's', n = 'n'
		real total = 0.0, totalFinal = 0.0
		caracter desejaComprar = 'x', continuarCompra = 'x'// opcaoPgto= 'x'
		//********************************************************
		

         

			//*********************************************
			// APRESENTAÇÃO DA LOJA
			apresentacao()
			Util.aguarde(500)
			apresentacao2()
		


			//	FALTA DEFINIR	//enquanto(opcaoPgto=='x'ou opcaoPgto=='1' ou opcaoPgto=='2' ou opcaoPgto=='3')
			//******************************************************
			//************* AQUI COMEÇA O LAÇO 1 *****************

			escreva("\t\t\t DESEJA FAZER COMPRAS? DIGITE.. \n")
			escreva("\t\t\t\t     S/N: ")
			
			enquanto (desejaComprar != 'S' e desejaComprar != 's' e desejaComprar != 'N' e desejaComprar != 'n'){
				leia(desejaComprar)
				limpa()
				
			
			//****************************************************************	
				para(inteiro y=0; y<10; y++){

					se(desejaComprar == 's' ou desejaComprar == 'S'){
						//cabeçalho LISTA DE PRODUTOS
				       	
				       	para(y=0; y<10; y++)
	          				escreva(codigoProduto[y]+"\t" +nomeProduto[y]+"\t"+"R$ " +valorProduto[y]+ "\t\t"+estoqueProduto[y]+ "\n")
				      	 }
				      	 senao{
							escreva("\n\nAté breve!")
							 //Finaliza o laço
							pare
						}
				      	 escreva("\n") 
					}
						
						
						escreva("\n")
						//Selecionar o produto
						
						escreva("\tExemplo: G2-1 - Tênis Nike")
						escreva("\n")
						escreva("\tSELECIONE O CODIGO DO PRODUTO: ")
						leia(codigoEscolhido)

					//***************** SELECIONE O CÓDIGO DO PRODUTO *******************

					para(x=0; x<10; ++x){
						se(codigoEscolhido == codigoProduto[x]){

							escreva ("COD "+codigoProduto[x]+"\t"+"PRODUTO "+nomeProduto[x]+" "+"VALOR "+valorProduto[x]+"\t"+"ESTOQUE "+estoqueProduto[x]+"\n")
							escreva ("\n")
								
							escreva("\tESCOLHA A QUANTIDADE : ")
							leia(qtaAdicionadoCarrinho[x])
							//***************** cabeçalho CARRINHO *******************
							se(qtaAdicionadoCarrinho[x] <= estoqueProduto[x] e carrinho[x]==" " e qtaAdicionadoCarrinho[x] >0){
								limpa()
								
								escreva ("■■■■■■■■■■■■■■■■■■■■■■■ Produto Selecionado ■■■■■■■■■■■■■■■■■■■■■■■■\n")
								escreva ("Código: Produto:           Valor:     Quantidade:\n")
								carrinho[x]=codigoProduto[x]+"\t"+nomeProduto[x]+"R$ "+(valorProduto[x]*qtaAdicionadoCarrinho[x])+"\t   "+qtaAdicionadoCarrinho[x]+"\n"
								
								para(inteiro c=0; c<10; c++){
									se(carrinho[c] != " "){
										escreva (carrinho[c])
										total = valorProduto[x]*qtaAdicionadoCarrinho[x]
									}

								}
								totalFinal = total+totalFinal
								
								escreva("\n\n\n")
								escreva("\tCONTINUAR A COMPRANDO? S/N : ")
								leia(continuarCompra)
								limpa()
	
								enquanto (continuarCompra != 'S' e continuarCompra != 's' e continuarCompra != 'N' e continuarCompra != 'n'){
								escreva("Opção Inválida, escreve S ou N\n")
								escreva ("Continuar a compra ? S/N ")
								leia(continuarCompra)
								}

								enquanto (carrinho[0] != " " e carrinho[1] != " " e carrinho[2] != " " e carrinho[3] != " " e carrinho[4] != " " e carrinho[5] != " " e carrinho[6] != " " e carrinho[7] != " " e carrinho[8] != " " e carrinho[9] != " "){
									escreva("Carrinho cheio, finalize sua compra")
														
									escreva ("\nContinuar a compra ? S/N ")
									leia(continuarCompra)
									limpa()
									se(continuarCompra == 'n' ou continuarCompra == 'N'){
										pare
									}
								}
									
							}//@AQUI ACABA O SEGUNDO > SE
				
							senao se (qtaAdicionadoCarrinho[x] > estoqueProduto[x]) {
								limpa()
								escreva("\n\n Indisponível essa quantidade..\n\n")
								pare
							}
							senao se (carrinho[x]!=" ") {
								limpa()
								escreva("\n\nVocê já adicionou esse item no carrinho! Escolha outro.\n\n")
								pare
							}
							senao se (qtaAdicionadoCarrinho[x]<=0){
								limpa()
								escreva("\nEscolha ao menos um valor positivo\n\n")
								pare
								
							}	
						}//@AQUI ACABA O PRIMEIRO > SE	
			
						senao se (codigoEscolhido != codigoProduto[0] e codigoEscolhido != codigoProduto[1] e codigoEscolhido != codigoProduto[2] e codigoEscolhido != codigoProduto[3] e codigoEscolhido != codigoProduto[4] e codigoEscolhido != codigoProduto[5] e codigoEscolhido != codigoProduto[6] e codigoEscolhido != codigoProduto[7] e codigoEscolhido != codigoProduto[8] e codigoEscolhido != codigoProduto[9]) {
							limpa()
							escreva("\nProduto inválido\n\n")
							pare
						}senao{
							
								
						}
			
			}//@AQUI ACABA O SEGUNDO PARA

					
		}//@AQUI ACABA O PRIMEIRO PARA
	}//@AQUI ACABA A FUNÇÃO MAIN















			
			//AQUI SÃO AS FUNÇÕES ÚTEIS

			// Função do bloco - Apresentacao 1
			funcao apresentacao(){
				para(inteiro x=0; x<5; ++x){
					cadeia linha1="■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n"
					escreva(linha1)
				}
					escreva("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■ LOJA DevShoes ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n")
					
				para(inteiro x=0; x<5; ++x){
					cadeia linha2="■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n"
					escreva(linha2)
				}
			}
			// Função do bloco - Apresentacao 2
			funcao apresentacao2 (){
				cadeia nomeLoja,slogan
				escreva("\n ")
				escreva("\n ")
				nomeLoja = "\t\t\tLoja DevShoes"
				slogan = "- CodeStyle é vida!"
				escreva(nomeLoja)
				escreva(" ")
				escreva(slogan)
		
				escreva("\n ")
				
				escreva("\t\t\t■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n")
			}

 
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 3696; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */