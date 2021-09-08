package aplicacoes;

import classes.Eletronico;

public class EletronicoPrincipal {

	public static void main(String[] args) {

		
		Eletronico marcaAparelho = new Eletronico();
		marcaAparelho.marca = "Samsung";
		marcaAparelho.eletronicoAtivado();
		
		Eletronico marcaAparelho2 = new Eletronico();
		marcaAparelho2.marca = "Apple";
		marcaAparelho2.eletronicoDesativado();

		
		
		
	}

}
