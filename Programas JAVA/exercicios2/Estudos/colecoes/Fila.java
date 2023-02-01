package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Jos�");// ADD da erro se passar do limite proposto
		fila.offer("Philippe");// OFFER da false se passar do limete proposto
		fila.add("Augusto");
		fila.offer("D.");
		fila.add("Silva");
		
		System.out.println(fila.peek());// Se n�o tiver o elemento na lista retorna null
		System.out.println(fila.element());// Se n�o tiver o elemento na lista da erro
		
		
		//Poll e Remove -> Obeter o pr�ximo elemtno da fila 
		System.out.println(fila.poll());//retorna null
		System.out.println(fila.remove());// Da erro
		
		
	}

}
