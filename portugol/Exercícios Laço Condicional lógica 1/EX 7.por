programa
{
	
	funcao inicio()
	{

	real base, altura, area
	
		escreva("Digite o valor da base do triangulo: \n")
		leia(base)

	
		escreva("Digite o valor da altura do triangulo: \n")
		leia(altura) 

		se(base > 0 e altura > 0) {

			area = ((base*altura) / 2 )

			escreva("A area do triangulo é:" + area)
			
		}
		escreva("A base ou altura é inválida")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 363; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */