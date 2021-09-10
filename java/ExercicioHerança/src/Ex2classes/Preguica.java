package Ex2classes;

public class Preguica extends Animal {

	public Preguica(String nome, int idade, String som, String corrida) {
		super(nome, idade, som, corrida);

	}
	
	
	public void subirArvore() {

		System.out.println("Subir em arvore");
	
	}

	@Override
	public String emitirSom() {

		return som;
	}
	
	

}