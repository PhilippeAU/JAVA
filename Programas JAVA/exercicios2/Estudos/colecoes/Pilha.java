package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O pequeno principe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		for(String livro: livros) {
			
			System.out.println(livro);
		
	}
		System.out.println(livros.pop());
		System.out.println(livros.poll());// Remove o primeiro
		System.out.println(livros.poll());// Ja removeu o primeiro
		System.out.println(livros.poll());// Ja removeu o segundo
//		System.out.println(livros.remove());
		
		livros.size(); //TAMANHO
		livros.clear(); //LIMPAR
		livros.contains(livros); //OLHA SE TEM O ITEM
		livros.isEmpty();// OLHA SE ESTA VAZIA
		
	}
}
