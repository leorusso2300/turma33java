package exercicio2;

public class Cachorro2 extends Animal2 {

	public Cachorro2(String name, int age, boolean emiteSom, boolean correr) {
		super(name, age, emiteSom, correr);
		// TODO Auto-generated constructor stub
	}

	public void correr() {
		if (super.isEmiteSom() == true) {
		System.out.println("Correndo...");
		}
	}

	@Override
	public void emiteSom() {
		if (super.isEmiteSom() == true) {
			System.out.println("AU, AU, AU...");
		}
	}

}