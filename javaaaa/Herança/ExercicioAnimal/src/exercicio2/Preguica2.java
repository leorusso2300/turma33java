package exercicio2;

public class Preguica2 extends Animal2 {

	public Preguica2(String name, int age, boolean emiteSom, boolean correr) {
		super(name, age, emiteSom, correr);
		// TODO Auto-generated constructor stub
	}

	public void subirArvore() {
			System.out.println("Preguiçaaaaaaaaaaa tentandooooo subirrrrrr na arvore.....");
		
	}

	@Override
	public void emiteSom() {
		if (super.isEmiteSom() == true) {
			System.out.println("AAAAAAAAAAAAAA..........");
		}
	}

}