programa
{
	
	funcao inicio()
	{
	
		cadeia nome
		real tempFaren
		real tempSaida
		
		escreva("Qual o seu nome?\n")
		leia(nome)		
		escreva("Digite a temperatura em Celcius\n")
		leia(tempFaren)
		tempSaida = (tempFaren * 1.8) + 32
		escreva("A temperatura convertida para Celsius é " + tempSaida)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 175; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */