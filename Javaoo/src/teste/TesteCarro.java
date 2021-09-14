package teste;

public class TesteCarro {

	public static void main(String[] args) {

		Carro meuCarro = new Carro();
		
		
		meuCarro.Cor = "Vermelho";
		meuCarro.modelo = "Golf GTI";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 80;
		
		meuCarro.liga();
		meuCarro.acelera(60);
		meuCarro.pegaMarcha();
		System.out.println(meuCarro.velocidadeAtual);
		System.out.println(meuCarro.pegaMarcha());
	}

}
