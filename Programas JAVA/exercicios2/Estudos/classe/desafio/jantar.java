package classe.desafio;

public class jantar {
	
	public static void main(String[] args) {
		
		comida c1 = new comida("Lasanha", 2.5);
		comida c2 = new comida("Arroz", 0.300);
		
		pessoa p = new pessoa("Philippe", 85);
		
		
		System.out.println(p.apresentar());
		p.comer(c1);
		System.out.println(p.apresentar());
		p.comer(c2);
		System.out.println(p.apresentar());
	}

}
