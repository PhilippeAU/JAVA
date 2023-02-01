package oo.composicao.desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Philippe");
		
		Compra compras1 = new Compra();
		compras1.adicionarItem("Caneta", 9.67 , 100);
		compras1.adicionarItem(new produto("Notebook", 1897.88),2);
		
		Compra compras2 = new Compra();
		compras2.adicionarItem("Caderno", 10 , 10);
		compras2.adicionarItem(new produto("Impressora", 998.90),1);
		
		cliente1.adicionarCompra(compras1);
		cliente1.adicionarCompra(compras2);
		
		System.out.println(cliente1.obterValorTotal());
		
	}
}
