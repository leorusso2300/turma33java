programa
{
	
	funcao inicio()
	{
		
		cadeia times[4]
		inteiro pontos[4]
		inteiro  resultado
		


		times[0]="São Paulo"
		times[1]="Palmeiras"
		times[2]="Corinthians"
		times[3]="Santos"



		para (inteiro y = 1 ; y<4 ;y++){


			escreva("--------------------\n")
			escreva("Rodada " + y + "\n")
			escreva("--------------------\n")

			para (inteiro x = 0; x < 4;x++){		
			
						
 			escreva ("O time " + times[x] + "\n1-Ganhou 2-Perdeu 3-Empatou\n")
			leia(resultado)

			se(resultado == 1){
			pontos[x]=pontos[x]+3
			}
			senao se(resultado == 2){
			pontos[x]=pontos[x]+0				
			}senao se(resultado == 3){
			pontos[x]=pontos[x]+1
			}
			senao{
				escreva("Digite o resultado correto")
			}
					
			}
			
		}
		para (inteiro x=0;x<4;x++){
			
 			escreva("\n", times[x], " Pontos: ", pontos[x])
 			
		}

		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 821; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */