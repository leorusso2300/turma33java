
public class TesteEscopo {

	public static void main(String[] args) {

		System.out.println("Testando Condicionais");

		int idade = 20;
		int quantidadePessoas = 3;

		boolean acompanhado = false;
		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;

		}
		if (idade >= 18 && acompanhado) {
			System.out.println("Voc� tem mais de 18 anos");
			System.out.println("Seja bem vindo");

		} else {

			System.out.println("Voc� n�o pode entrar, pois n�o tem 18 anos!");
		}
	}
}
