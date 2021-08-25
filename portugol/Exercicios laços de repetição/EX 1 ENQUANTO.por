programa
{
	inclua biblioteca Util
	funcao inicio()
	{

		real numero = 0.0, soma = 0.0, total = 0.0, media= 0.0

		

		enquanto(numero >= 0){			
		escreva("Digite um número: ")
		leia(numero)

		se(numero>=0){		

		soma = soma + numero
		total = total + 1
			
		}

		
		}

		media  = (soma / total)
		
		escreva("A soma dos números digitados é de:" + soma + "\n")
		escreva("A média dos números digitados é de:" + media + "\n")
		escreva("O total dos números digitados é de:" + total + "\n")
		

	
	
			
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 492; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */