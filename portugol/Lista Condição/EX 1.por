programa
{
	
	funcao inicio()
	{

		inteiro num
		
		escreva("Digite um número inteiro positivo: ")
		leia(num)

		se (num < 0){
			
		escreva("IMPOSSIVEL REALIZAR, NÚMERO NEGATIVO!!!!")
		
		}
		senao se (num == 0){
			escreva("Zero é neutro")
		}
		senao se(num % 2 == 0){

		escreva("Esse número é par")
					
		}
		senao{
			escreva("Esse número é impar")
		}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 195; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */