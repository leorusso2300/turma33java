programa
{
	
	funcao inicio()
	{

		inteiro totalDias, anos,dias,meses,idade
	
		escreva("Digite sua idade em dias: ")
		leia(totalDias)

		
		anos = totalDias / 365
		totalDias = totalDias % 365
		meses = totalDias / 30
		totalDias = totalDias % 30
		idade = totalDias
		

		escreva("Sua idade em anos é: " + anos)

		escreva("\nSua idade em meses é: " + meses)

		escreva("\nSua idade em dias é: " + idade)

		

		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 394; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */