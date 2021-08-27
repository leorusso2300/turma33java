programa
{
	
	funcao inicio()
	{

		inteiro mat[3][3],l,c
		inteiro total = 0, totalDia = 0 
		


		para(l = 0; l <3 ; l++){
			para(c = 0; c<3;c++){
				leia(mat[l][c])


				total = total + mat[l][c]

				se(l == c){
				totalDia += mat[l][c]
				}								
			}
		}

		
		para(l = 0; l <3 ; l++){
			para(c = 0; c<3;c++){
			


				escreva(mat[l][c] + "\n")							
			}
		}
		

		escreva("---------------------------------------\n")
		escreva("O total de números é de: " + total + "\n")
		escreva("A soma dos números na diagonal é de: " + totalDia)
		escreva("\n---------------------------------------")
								
				
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 564; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {mat, 7, 10, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */