package exercicio2;

public abstract class Animal2 {

	// Atributos
	private String name;
	private int age;
	private boolean emiteSom = false;
	private boolean correr = false;

	// Construtor

	public Animal2(String name, int age, boolean emiteSom, boolean correr) {
		super();
		this.name = name;
		this.age = age;
		this.emiteSom = emiteSom;
		this.correr = correr;
	}

	// encapsulamento

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isEmiteSom() {
		return emiteSom;
	}

	public void setEmiteSom(boolean emiteSom) {
		this.emiteSom = emiteSom;
	}

	public boolean isCorrer() {
		return correr;
	}

	public void setCorrer(boolean correr) {
		this.correr = correr;
	}

	// metodos
	public void emiteSom() {
		System.out.println("Emetindo Som...");
	}
}