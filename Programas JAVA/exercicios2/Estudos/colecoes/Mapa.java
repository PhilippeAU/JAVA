package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
	public static void main(String[] args) {
		
		Map<Integer, String> usuario = new HashMap<>();
		
		usuario.put(1, "José");
		usuario.put(2, "Philippe");
		usuario.put(3, "Augusto");
		usuario.put(4, "Silva");
		
		System.out.println(usuario.size());//TAMANHO
		System.out.println(usuario.isEmpty());//VAZIO
		
		System.out.println();
		
		System.out.println(usuario.keySet());//SÓ MOSTRA AS CHAVES
		System.out.println(usuario.values());//SÓ MOSTRA OS VALORES DAS CHAVES
		System.out.println(usuario.entrySet());//MOSTRA AS CHAVES E OS VALORES
		
		System.out.println();
		
		System.out.println(usuario.containsKey(20));
		System.out.println(usuario.containsKey(4));
		System.out.println(usuario.containsValue("Silva"));
		
		System.out.println(usuario.get(2));
		
		System.out.println();
		
		for(int chave: usuario.keySet()) {
			
			System.out.println(chave);
		}
		
		System.out.println();
		
		for(String valor: usuario.values()) {
			
			System.out.println(valor);
		}
		
		System.out.println();
		
		for(Entry<Integer, String> registro: usuario.entrySet()) {
			
			System.out.print(registro.getKey() + " ");
			System.out.println(registro.getValue());
		}
	}
}
