programa
{
	
	funcao inicio()
	{


		real indice
	
		escreva("Digite o índice de poluição: ")
		leia(indice)


		se(indice >= 0.05 e indice <= 0.25)
		{
			escreva("---------\n")
			escreva("Aceitável\n")
			escreva("---------\n")
			
		}
		senao se (indice < 0.3){
			escreva("----------------\n")
			escreva("Não especificado\n")
			escreva("----------------\n")
		}senao se (indice >= 0.3 e indice < 0.4){

			escreva("----------------------------------------------------------------------\n")
			escreva("As indústrias do 1º grupo são intimadas as suspenderem suas atividades\n")
			escreva("----------------------------------------------------------------------\n")
		}
		
		senao se (indice >= 0.4 e indice < 0.5){

			escreva("--------------------------------------------------------------------------\n")
			escreva("As indústrias do 1º e 2º grupo são intimadas a suspenderem suas atividades\n")
			escreva("--------------------------------------------------------------------------\n")
			
		}senao {
			
			escreva("----------------------------------------------\n")
			escreva("Todos os grupos devem paralisar as atividades\n")
			escreva("----------------------------------------------\n")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 263; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */