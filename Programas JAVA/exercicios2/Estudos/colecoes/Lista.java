package colecoes;

import java.util.ArrayList;

public class Lista {
	
	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Bezerra");
		lista.add(u1);
		
		lista.add(new Usuario("José"));
		lista.add(new Usuario("Philippe"));
		lista.add(new Usuario("Augusto"));
		lista.add(new Usuario("Silva"));
		
		System.out.println(lista.get(3));//Acessar pelo indice
		
		lista.remove(1);
		lista.remove(new Usuario("Silva"));
	
		System.out.println("Tem ? " + lista.contains(new Usuario("Philippe")));
		
		for(Usuario u: lista) {
			
			System.out.println(u.nome);
		}
	}

}
