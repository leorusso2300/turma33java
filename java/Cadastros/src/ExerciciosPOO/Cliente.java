package ExerciciosPOO;

public class Cliente {

	public String nome;
	public boolean ativo = false;
	public double saldo = 0.0;

	public void ativarCliente() {
		System.out.println("O cadastro do cliente foi ativado");
		ativo = true;
	}

	public void desativarCliente() {
		System.out.println("O cadastro do cliente foi desativado");
		ativo = false;
	}

	public void ativoCliente() {
		if (ativo) {
			System.out.println("O cliente " + nome + " est� ativo");
		} else {
			System.out.println("O cliente " + nome + " n�o est� ativo");

		}

	}
}