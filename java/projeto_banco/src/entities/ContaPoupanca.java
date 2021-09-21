package entities;

public class ContaPoupanca extends Conta {

	// atributos
	private int diaAniversarioPoupanca;

	// construtores
	public ContaPoupanca(int numero, String cpf, int diaAniversarioPoupanca) {
		super(numero, cpf);
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	}
	public ContaPoupanca(int numero, String cpf, double saldo, boolean ativo, int diaAniversarioPoupanca) {
		super (numero, cpf, saldo, ativo);
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	}
	
	// encapsulamento
	public int getDiaAniversarioPoupanca() {
		return this.diaAniversarioPoupanca;
	}
	
	public void setDiaAniversarioPoupanca(int diaAniversarioPoupanca) {
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	}

	// metodos
	public void correcao(int diaInformado) {
		double valorCorrecao;
		if (diaInformado == this.diaAniversarioPoupanca) {
			valorCorrecao = (super.getSaldo() * 0.005);
			super.credito(valorCorrecao);
		}
	}
}