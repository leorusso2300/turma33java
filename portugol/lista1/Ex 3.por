programa
{
	
	funcao inicio()
	{

	inteiro segundos, horas, minutos

	escreva("Digite o tempo em segundos: ")
	leia(segundos)

	horas = segundos / 3600
	minutos = (segundos % 3600) / 60
	segundos=((segundos%3600)%60)

	


	escreva("Horas: " + horas)
	escreva("\n Minutos " + minutos)
	escreva("\n Segundos " + segundos)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 323; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */