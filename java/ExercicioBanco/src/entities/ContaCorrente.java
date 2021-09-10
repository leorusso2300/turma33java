package entities;

public class ContaCorrente extends Conta {
	// atributos
	private int contadorTalao;

	// construtor

	public ContaCorrente(int numero, String cpf, int contadorTalao) {
		super(numero, cpf);
		this.contadorTalao = contadorTalao;
	}

	// encapsulamento - getters and setters

	public int getContadorTalao() {
		return contadorTalao;
	}

	public void setContadorTalao(int contadorTalao) {
		this.contadorTalao = contadorTalao;
	}

	// metodos

	public void pediTalao(int qtd) {

		if (qtd <= 0) {
			System.out.println("Não pode inserir número negativo!");
		}
		for (int x = 0; x < qtd; x++) {
			if (contadorTalao <= 3 && qtd <= 3) {
				super.debito(30);
				contadorTalao = contadorTalao + 1;
			} else if (qtd > 3 || contadorTalao > 3) {
				System.out.println("Impossivel, limite atingido!!!");
				break;
			} 
		}
	}

	@Override
	public String toString() {
		return "Conta numero=" + super.getNumero() + ", cpf=" + super.getCpf() + ", saldo=" + super.getSaldo()
				+ ", contadortalao=" + this.contadorTalao;

	}

}