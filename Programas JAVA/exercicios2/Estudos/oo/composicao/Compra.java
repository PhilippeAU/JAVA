package oo.composicao;

import java.util.ArrayList;

public class Compra {
	
	String Cliente;
	ArrayList<item> itens = new ArrayList<item>();
	
	void adicionarItem(String nome, int quantidade, double preco){
		
		this.adicionarItem(new item(nome, quantidade, preco));
	}
	
	void adicionarItem(item item){
		
		this.itens.add(item);
		item.compra = this;
	}
	
	
	double obtervalorTotal() {
		
		double total = 0;
		
		for(item item: itens) {
			
			total += item.quantidade * item.preco;
		}
		
		return total;
	}
	
}
