programa
{
	
	funcao inicio()
	{

		
		inteiro pontuacao[6]
		inteiro maiorPontuacao = 0
		inteiro total[6]
			
		para(inteiro x = 1 ; x <= 5 ; x++){

			escreva("Digite o valor da pontuação " + x + ":")
			leia(pontuacao[x])

			se(pontuacao[x] > maiorPontuacao){

				maiorPontuacao = pontuacao[x]				
							
			}

			
			
			
		}
		
		para(inteiro x = 1 ; x<=5 ; x++){
			escreva(pontuacao[x] + " ")
		}
		escreva("\nA maior pontuação é : " + maiorPontuacao)
				
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 426; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */