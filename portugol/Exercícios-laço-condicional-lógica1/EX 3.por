programa
{
	
	funcao inicio()
	{

		inteiro n1, n2, n3, n4
		inteiro quadrado1, quadrado2, quadrado3, quadrado4

		escreva("Digite um número: ")
		leia(n1)

		escreva("Digite um número: ")
		leia(n2)

		escreva("Digite um número: ")
		leia(n3)
		

		 quadrado3 = n3 * n3
		 
		
		se(quadrado3 >= 1000){
			
			escreva("--------------------------------\n")
			
			escreva("O quadrado do terceiro número é: " + quadrado3 + "\n")

			escreva("--------------------------------")
		}senao{

			escreva("Digite um número: ")
			leia(n4)
			
			 quadrado1 = n1 * n1
			 quadrado2 = n2 * n2
			 quadrado3 = n3 * n3
			 quadrado4 = n4 * n4


			escreva("--------------------------------\n")


			escreva(" O quadrado do primeiro número é: " + quadrado1,"\n")
			escreva(" O quadrado do segundo número é: " + quadrado2,"\n")
			escreva(" O quadrado do terceiro número é: " + quadrado3,"\n")
			escreva(" O quadrado do quarto número é: " + quadrado4,"\n")
			
			
		}

		
		
		


		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 948; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */