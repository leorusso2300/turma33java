programa
{
	
	funcao inicio()
	{

		inteiro idade
		
		escreva("Digite a idade do nadador: ")
		leia(idade)

		se(idade >= 5 e idade <= 7){
			escreva("---------------\n")
			escreva("Infantil A\n")
			escreva("---------------")
		}
		senao se(idade >= 8 e idade <= 11){
			escreva("---------------\n")
			escreva("Infantil B\n")
			escreva("---------------")
		}senao se(idade >= 12 e idade <= 13){
			escreva("---------------\n")
			escreva("Juvenil A\n")
			escreva("---------------")
		}senao se(idade >= 14 e idade <= 17){
			escreva("---------------\n")
			escreva("Juvenil B\n")
			escreva("---------------")
		}senao se(idade >= 18){
			escreva("---------------\n")
			escreva("Adulto\n")
			escreva("---------------")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 694; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */