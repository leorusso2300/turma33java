programa
{
	
	funcao inicio()
	{
		

		cadeia nome
		inteiro pronome
		real nota, media
		real somaNotas = 0.0, maiorNota = 0.0, porcNota = 0.0	
		
		escreva("Digite o nome do aluno: ")
		leia(nome)

		escreva("Como você prefere ser chamado: \n1-Aluno\n2-Aluna\n3-Alune\n")
		leia(pronome)
		
		
		para(inteiro x=1 ; x<= 5 ; x++){

		escreva("Digite a nota ",x,":")
		leia(nota)

		somaNotas =  (somaNotas + nota)		


		se(nota>maiorNota){
			maiorNota = nota
		}

		se(nota >= 5){
			porcNota = porcNota + 1
		}
		}

		
		media = (somaNotas / 5)
		escreva(media,"\n")

		porcNota = ((porcNota / 5) * 100)
		
		se(media >= 5){

			se(pronome == 1){
			escreva("-------------------------------\n")
			escreva("O aluno ",nome," foi aprovado, sua média foi: " + media + "\nSua maior nota foi: " + maiorNota + "\nA porcentagem de notas igual ou superiores a 5 é de: " + porcNota + "\n")
			escreva("-------------------------------\n")
			}senao se (pronome == 2){
			escreva("-------------------------------\n")
			escreva("A aluna ",nome," foi aprovada, sua média foi: " + media + "\nSua maior nota foi: " + maiorNota + "\nA porcentagem de notas igual ou superiores a 5 é de: " + porcNota + "\n")
			escreva("-------------------------------\n")
			}senao se (pronome == 2){
			escreva("-------------------------------\n")
			}senao se (pronome == 3){
			escreva("-------------------------------\n")
			escreva("O alune ",nome," foi aprovade, sua média foi: " + media + "\nSua maior nota foi: " + maiorNota + "\nA porcentagem de notas igual ou superiores a 5 é de: " + porcNota + "\n")
			escreva("-------------------------------\n")
			}senao se (pronome == 2){
			escreva("-------------------------------\n")
			}
		}
		senao{
			se(pronome == 1){
			escreva("-------------------------------\n")
			escreva("O aluno ",nome," foi reprovado sua média foi: " + media + "\nSua maior nota foi: " + maiorNota + "\nA porcentagem de notas igual ou superiores a 5 é de: " + porcNota + "\n")
			escreva("-------------------------------\n")
			}senao se (pronome == 2){
			escreva("-------------------------------\n")
			}senao se (pronome == 2){
			escreva("-------------------------------\n")
			escreva("A aluna ",nome," foi reprovada sua média foi: " + media + "\nSua maior nota foi: " + maiorNota + "\nA porcentagem de notas igual ou superiores a 5 é de: " + porcNota + "\n")
			escreva("-------------------------------\n")
			}senao se (pronome == 2){
			escreva("-------------------------------\n")
			}senao se (pronome == 3){
			escreva("-------------------------------\n")
			escreva("O alune ",nome," foi reprovade sua média foi: " + media + "\nSua maior nota foi: " + maiorNota + "\nA porcentagem de notas igual ou superiores a 5 é de: " + porcNota + "\n")
			escreva("-------------------------------\n")
			}senao se (pronome == 2){
			escreva("-------------------------------\n")
			}
		}


		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2755; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */