programa
{
	
	funcao inicio()
	{

		real p, E, m
		
	
		escreva("Peso do tomate: ")
		leia(p)

		

		se (p > 50){

		E = (p - 50)
		m = (p - 50) * 4

		escreva("--------------------------------------\n")
		escreva("Excesso: ", E, "KG \n")
		escreva("Valor da multa: R$", m +"\n")
		escreva("--------------------------------------\n")
		
			
		}
		senao{

		E = 0.0
		m = 0.0
		
		escreva("--------------------------------------\n")
		escreva("Excesso: ", E, "KG \n")
		escreva("Valor da multa: R$", m + "\n")
		escreva("--------------------------------------\n")
		
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 507; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */