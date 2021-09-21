package lista5_poo;

public class CarroPrincipal {

	public static void main(String[] args) {

		CarroClasse carro1 = new CarroClasse();
		
		
		carro1.modelo = "Golf";
		carro1.cor = "Preto";
		carro1.velocidadeAtual = 0;
		carro1.velocidadeMaxima = 80;
		
		
		carro1.Liga();
		carro1.Acelera(20);
		System.out.println(carro1.velocidadeAtual);
		carro1.pegaMarcha();

	}

}
