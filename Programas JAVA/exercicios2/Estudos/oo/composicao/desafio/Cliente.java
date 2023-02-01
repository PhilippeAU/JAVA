package oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {
	
	final String nome;
	ArrayList<Compra> compras = new ArrayList<Compra>();
	
	Cliente (String nome){
		
		this.nome = nome;
	
	}
	
	void adicionarCompra(Compra compra) {
		
		this.compras.add(compra);
	}
	
	double obterValorTotal(){
		
		double total = 0;
		for(Compra compra: compras) {
			total += compra.obterValorTotal();
		}
		
		return total;
				
	}
}
