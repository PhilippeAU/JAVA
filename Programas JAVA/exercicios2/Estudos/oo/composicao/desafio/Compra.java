package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {

		final ArrayList<Item> itens = new ArrayList<Item>();
		
		void adicionarItem(produto p, int quantidade) {
			
			this.itens.add(new Item(p,quantidade));
		}
		
		void adicionarItem(String nome, double preco, int quantidade) {
			
			var produto = new produto(nome, preco);
			this.itens.add(new Item(produto,quantidade));
		}
		
		double obterValorTotal() {
			
			double total = 0;
			
			for(Item item: itens) {
				total +=item.quantidade * item.produto.preco;
			}
			
			return total;
		}
		
		
	

}
