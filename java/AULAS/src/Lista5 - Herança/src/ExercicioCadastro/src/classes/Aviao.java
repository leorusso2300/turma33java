package classes;

public class Aviao {

	public String aviaoNome;
	public boolean ligado = false;
	public double altitude;

	public void ligarAviao() {
		System.out.println("O avião foi ligado");
		
	}

	public void desligarAviao() {
		System.out.println("O avião foi desligado");
	}
}
