programa
{
	
	funcao inicio()
	{


		real indice
	
		escreva("Digite o indice de poluição: \n")
		leia(indice)


		se(indice >= 0.05 e indice <= 0.25)
		{
			escreva("Aceitavel")
		}senao se (indice == 0.30){
			escreva("Grupo 1 atividades restritas")
		}senao se (indice == 0.40){
			escreva("As industrias 1 e 2 são intimadas")
		}senao se (indice == 0.50){
			escreva("Todos os grupos devem paralisar as atividades")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 423; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */