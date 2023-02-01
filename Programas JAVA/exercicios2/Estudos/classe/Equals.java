package classe;

//import java.util.Date;

public class Equals {
	
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Philippe Augusto";
		u1.email = "philippeaugusto96@gmail.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Philippe Augusto";
		u2.email = "philippeaugusto96@gmail.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		
		//System.out.println(u2.equals(new Date()));
	}

}
