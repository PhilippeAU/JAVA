package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compra Compra1 = new Compra();
		Compra1.Cliente = "José Philippe";
		Compra1.adicionarItem(new item("Caneta", 20, 7.45));
		Compra1.adicionarItem(new item("Boracha", 12, 3.89));
		Compra1.adicionarItem(new item("Caderno", 3, 18.79));
		
		System.out.println(Compra1.itens.size());
		System.out.println(Compra1.obtervalorTotal());
	}
}
