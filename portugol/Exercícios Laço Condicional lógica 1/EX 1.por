programa
{
	
	funcao inicio()
	{

		real p, E, m
		
	
		escreva("Peso do tomate: \n")
		leia(p)

		

		se (p > 50){

		E = (p - 50)
		m = (p - 50) * 4

		escreva("Excesso: ", E, "KG \n")
		escreva("Valor da multa: R$", m)
		
			
		}
		senao{

		E = 0.0
		m = 0.0
		escreva("Excesso: ", E, "KG \n")
		escreva("Valor da multa: R$", m)
		
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 268; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */