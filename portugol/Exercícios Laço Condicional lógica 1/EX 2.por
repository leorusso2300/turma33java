programa
{
	
	funcao inicio()
	{

		inteiro c, n, horaExcedente
		real salario, salarioExtra, salarioTotal
		
	
		escreva("Digite o código do trabalhador: \n")
		leia (c)

		escreva("Digite o número de horas trabalhadas: \n")
		leia (n)

		
		se(n > 50){
		salario = 50 * 10.00
		horaExcedente = n - 50
		salarioExtra = 20.00 * horaExcedente
		salarioTotal = salario + salarioExtra

		escreva("Funcionario: " + c + "\n Horas excedentes: " + horaExcedente + "\n Salário extra R$: " + salarioExtra + "\n Salário total R$: " + salarioTotal)  
		
		
		}
		senao{

		salario = (n * 10.00)
		escreva("Funcionario: " + c + "\n Salário total R$:" + salario)
		
			
		}
		

		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 347; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */