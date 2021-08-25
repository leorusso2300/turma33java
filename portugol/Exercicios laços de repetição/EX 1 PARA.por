programa
{
	
	funcao inicio()
	{

	real salario, somaSalario = 0.0, mediaSalario, maiorSalario = 0.00, percSalario = 0.00
	real totalSalario = 0.0
	inteiro nfilhos, somaFilhos = 0, mediaFilhos, totalFilhos = 0

	para(inteiro x = 1; x<=2; x++){
		
		escreva("Salário morador " + x + ":")
		leia(salario)

		escreva("Número de filhos morador " + x + ":")
		leia(nfilhos)

		somaSalario = somaSalario + salario
		somaFilhos = somaFilhos + nfilhos 
		totalSalario = totalSalario + salario 
		totalFilhos = totalFilhos + nfilhos

		se(salario > maiorSalario){
			maiorSalario = salario
		}

		se(salario > 100){
			percSalario = (percSalario + 1)
		}

		
	}
	

	mediaSalario = (somaSalario / 2)
	mediaFilhos = (somaFilhos / 2)
	percSalario = ((percSalario / 2) * 100)

	escreva("----------------------------------------------------------------\n")
	escreva("A média do salário dos moradores é de: " + mediaSalario + "R$\n")
	escreva("A média de filhos dos moradores é de: " + mediaFilhos)
	escreva("\nO número total de filhos é:" + totalFilhos)
	escreva("\nO maior salário é de:" + maiorSalario + "R$\n")
	escreva("O percentual de salários maiores que 100% é de: " + percSalario + "%\n")
	escreva("O total dos salário dos moradores é de :" + totalSalario)
	escreva("\n----------------------------------------------------------------")
	
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 994; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */