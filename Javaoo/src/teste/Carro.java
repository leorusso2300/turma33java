package teste;

public class Carro {

	String Cor;
	String modelo;
	double velocidadeAtual;
	double velocidadeMaxima;

	void liga() {
		System.out.println("O carro está ligando...");
	}

	void acelera(double quantidade) {
		double velocidadeNova = this.velocidadeAtual + quantidade;
		this.velocidadeAtual = velocidadeNova;
	}

	int pegaMarcha() {
		if(this.velocidadeAtual < 0) {
			return -1;
		}if(this.velocidadeAtual > 0 && this.velocidadeAtual < 40) {
			return 1;
		}if(velocidadeAtual > 40 && velocidadeAtual < 80) {
			return 2;
		}
		return 3;

}
}