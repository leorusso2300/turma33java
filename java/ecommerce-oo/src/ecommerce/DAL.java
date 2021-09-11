package ecommerce;

import java.util.ArrayList;
import java.util.List;

public class DAL {
	private List<Product> produtosDisponiveis;
	private Carrinho carrinho;

	public DAL() {
		this.produtosDisponiveis = new ArrayList<Product>();

		Product ps5 = new Product("1", "PS5", 5000, 3);
		Product mac = new Product("2", "MAC que eu não pagaria", 32000, 5);
		Product pcGamer = new Product("3", "PC Gamer Pichau Que Não Funciona", 2700, 6);

		this.produtosDisponiveis.add(ps5);
		this.produtosDisponiveis.add(mac);
		this.produtosDisponiveis.add(pcGamer);
	}

	public List<Product> getProdutosDisponiveis() {
		return this.produtosDisponiveis;
	}

	public void mostraProdutosDisponiveis() {
		String formatter = "%-4s %-40s %-6s";
		System.out.println("=== Produtos Disponíveis ===");
		System.out.format(formatter, "ID", "NOME", "PRECO");
		
		for (Product product : this.produtosDisponiveis) {
			System.out.println("\n");
			String id = product.getId();
			String nome = product.getNome();
			String preco = product.getPreco();
			System.out.format(formatter, id, nome, preco);
		}
	}
}
