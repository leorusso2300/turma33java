package entities;

public class ContaCorrente extends Conta {
	// atributos
	private int contadorTalao;
	int contador = 0;
	// construtor

	public ContaCorrente(int numero, String cpf, double saldo, boolean ativo, int contadorTalao) {
		super(numero, cpf, saldo, ativo);
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
			System.out.println("Número inválido!");
		}
		contadorTalao = qtd;
		if (contadorTalao == 1) {
			super.debito(30);
			contadorTalao++;
		} else if (contadorTalao == 2) {
			super.debito(60);
			contadorTalao++;
			;
		} else if (contadorTalao == 3) {
			super.debito(90);
		} else if (contadorTalao > 3) {
			contadorTalao = 0;
			System.out.println("Impossível, limite atingido!");

		}
	}

	// for (int x = 0; x < qtd; x++) {

	// while (contador <= 3) {
	// contadorTalao = qtd;

	/*
	 * if (contadorTalao > 3) { System.out.println("Impossível, limite atingido!");
	 * break; } else { super.debito(30); contadorTalao++; break; }
	 * 
	 * }
	 */
	// contador++;
	// }

	@Override
	public String toString() {
		return "Conta numero=" + super.getNumero() + ", cpf=" + super.getCpf() + ", saldo=" + super.getSaldo()
				+ ", contadortalao=" + this.contadorTalao;
	}
}
