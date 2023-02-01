package colecoes;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		
		usuarios.add(new Usuario("Philippe"));
		usuarios.add(new Usuario("Silva"));
		usuarios.add(new Usuario("José"));
		usuarios.add(new Usuario("Augusto"));
		
		
		boolean resultado = usuarios.contains(new Usuario("Augusto"));
		System.out.println(resultado);
	}
}
