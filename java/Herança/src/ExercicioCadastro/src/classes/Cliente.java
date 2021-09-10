package classes;

public class Cliente {

	public String nome;
	public int anoNascimento;
	public boolean ativo = false;

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
			System.out.println("O cliente " + nome + " está ativo");
		} else {
			System.out.println("O cliente " + nome + " não está ativo");

		}

	}
}
