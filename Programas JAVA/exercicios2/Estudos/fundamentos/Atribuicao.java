package fundamentos;

public class Atribuicao {
		
	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		@SuppressWarnings("unused")
		int c = a + b;
		
		
		//c = c + b;
		c += b;
		c -= a;
		c *= b;
		c /= a;
		c %= 2;
		
		c++;
		
	}

}
