programa
{
	
	funcao inicio()
	{

		cadeia nome
		inteiro resposta, receber
		
	
		escreva("Digite seu nome: ")
		leia(nome)

		escreva("Você é a chefa da familia?\n 1- Sim\n 2- Não\n")
		leia(resposta)

		se (resposta == 1){

		escreva("Olá " + nome + " você é a chefa da familia e vai receber R$1.200,00")
			
		}
		senao se (resposta == 2){
			escreva("Olá " + nome + " você não é a chefa da familia e vai receber R$600,00")
		}
		senao{
			escreva("Opção incorreta!!!!!")

		}
		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 479; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */