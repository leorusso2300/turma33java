package aplicacoes;

import classes.Cliente;

public class ClientePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente1 = new Cliente();	
		cliente1.nome = "Leonardo";
		cliente1.anoNascimento = 1999;
		cliente1.ativarCliente();
		cliente1.ativoCliente();		
		System.out.println("Olá " + cliente1.nome + " sua idade é " + (2021 - cliente1.anoNascimento) + " anos");
		
		System.out.println("-----------------------------------");
		
		Cliente cliente2 = new Cliente();	
		cliente2.nome = "ED";
		cliente2.anoNascimento = 1980;
		cliente2.ativarCliente();
		cliente2.ativoCliente();
		
		System.out.println("Olá " + cliente2.nome + " sua idade é " + (2021 - cliente2.anoNascimento) + " anos");

		
	

	}

}
