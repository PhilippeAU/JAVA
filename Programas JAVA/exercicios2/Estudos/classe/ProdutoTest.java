package classe;


public class ProdutoTest {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook");
		//p1.nome = "Notebook";
		p1.preco = 4356.89;
		Produto.desconto = 0.25; 
		
		var p2 = new Produto(null);
		p2.nome = "Caneta";
		p2.preco = 5.00;
		Produto.desconto = 0.29;
		
		System.out.println(p1.nome + "" + p1.precoComDesconto()); 
		System.out.println(p2.nome + "" + p2.precoComDesconto());
		
		System.out.println(p1.preco); 
		System.out.println(p2.preco); 
		
		System.out.println(p1.precoComDesconto()); 
		System.out.println(p2.precoComDesconto()); 
		
	}

}
