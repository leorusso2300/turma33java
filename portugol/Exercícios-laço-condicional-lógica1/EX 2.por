programa
{
	
	funcao inicio()
	{

		inteiro c, n, horaExcedente
		real salario, salarioExtra, salarioTotal
		
	
		escreva("Digite o código do trabalhador: ")
		leia (c)

		escreva("Digite o número de horas trabalhadas: ")
		leia (n)

		
		se(n > 50){
		salario = 50 * 10.00
		horaExcedente = n - 50
		salarioExtra = 20.00 * horaExcedente
		salarioTotal = salario + salarioExtra

		escreva("--------------------------------------\n")
		escreva("Funcionário: " + c + "\nHoras excedentes: " + horaExcedente + "\nSalário extra R$: " + salarioExtra + "\nSalário total R$: " + salarioTotal + "\n")  
		escreva("--------------------------------------\n")
		
		}
		senao{

		salario = (n * 10.00)
		escreva("--------------------------------------\n")
		escreva("Funcionário: " + c + "\nSalário total R$:" + salario + "\n")
		escreva("--------------------------------------\n")
		
			
		}
		

		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 590; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */