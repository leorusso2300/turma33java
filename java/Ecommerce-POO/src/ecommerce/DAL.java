package ecommerce;

import java.util.ArrayList;
import java.util.List;

public class DAL {
	private List<Product> produtosDisponiveis;
	private Carrinho carrinho;

	public DAL() {
		this.produtosDisponiveis = new ArrayList<Product>();
		this.carrinho = new Carrinho();

		Product ps5 = new Product("1", "Tênis Nike", 5000, 3);
		Product mac = new Product("2", "Tênis Adidas", 32000, 5);
		Product pcGamer = new Product("3", "PC Gamer Pichau Que Não Funciona", 2700, 6);

		this.produtosDisponiveis.add(ps5);
		this.produtosDisponiveis.add(mac);
		this.produtosDisponiveis.add(pcGamer);
	}

	public List<Product> getProdutosDisponiveis() {
		return this.produtosDisponiveis;
	}

	public void addProductCarrinho(String id, int quantidade) {
		Product product = this.findProductById(id);
		this.carrinho.addItem(product, quantidade);
	}

	private Product findProductById(String id) {

		for (Product product : this.getProdutosDisponiveis()) {
			if (product.getId().equals(id)) {
				return product;
			}
		}
		return null;
	}
	
	public void exibeProdutosDisponiveis() {
		System.out.println("=== Produtos Disponíveis ===");
		helpers.mostraProdutos(this.produtosDisponiveis);
	}
	
	public void exibeProdutosCarrinho() {
		this.carrinho.listaProdutos();
	}
	
	public void previewProduto(String id) {
		Product produto = this.findProductById(id);
		helpers.mostraUmProduto(produto);
	}
}

