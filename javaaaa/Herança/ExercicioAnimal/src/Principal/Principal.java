package Principal;

import exercicio2.Cachorro2;
import exercicio2.Cavalo2;
import exercicio2.Preguica2;
public class Principal {

	public static void main(String[] args) {
		
		Cachorro2 dogao = new Cachorro2("CARAMELO", 5, true, true);
		Cavalo2 pangare = new Cavalo2("PÉ-DE-PANO", 8, true, true);
		Preguica2 sono = new Preguica2("THE FLASH", 6, true, true);
		
	    pangare.emiteSom();
	    pangare.correr();
	    dogao.emiteSom();
	    dogao.correr();
	    sono.emiteSom();
	    sono.subirArvore();
		
	}

}