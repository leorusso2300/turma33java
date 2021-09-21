package lista5_poo;

public class ClienteClass {

	String nome;
	int idade;

	void Apresentacao() {
		System.out.println("Seja bem vindo!");
	}

	 void idadePessoa(int idade, String nome) {

		if (idade >= 18) {
			System.out.println("Olá " + nome + " você é maior de idade!");

		} else if (idade < 18) {
			System.out.println("Olá " + nome + " você não é maior de idade!");
		}

	}
	 
	 

}
