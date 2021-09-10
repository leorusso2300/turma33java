package exercicio3;

public class Principal {

	public static void main(String[] args) {
		
		//Interface //Produto 1
		Eletronico produto1 = new Eletronico();
		produto1.name = "Fogão brastemp";
		produto1.category = "FOGÃO";
		produto1.inventory = 5;
		produto1.price = 2.589;
		
		//Interface //Produto 2
		Eletronico produto2 = new Eletronico();
		produto2.name = "Fogão consul";
		produto2.category = "FOGÃO";
		produto2.inventory = 3;
		produto2.price = 2.589;
		
		//Interface //Produto 3
		Eletronico produto3 = new Eletronico();
		produto3.name = "Fogão LG";
		produto3.category = "FOGÃO";
		produto3.inventory = 7;
		produto3.price = 2.589;
		
		System.out.print("Lista de produtos\n");
		
		System.out.println("1° "+produto1.getName()+" R$"+produto1.price+" "+ produto1.inventory+" unidades");
		System.out.println("2° "+produto2.getName()+" R$"+produto2.price+" "+ produto2.inventory+" unidades");
		System.out.println("3° "+produto3.getName()+" R$"+produto3.price+" "+ produto3.inventory+" unidades");
		
	}

}