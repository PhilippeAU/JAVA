package controle;

import java.util.Scanner;

public class LetraPorLetra {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a palavra: ");
		String palavra = entrada.next();
		
		char[] letras = palavra.toCharArray();
		
		for (int i = 0; i < letras.length; i++) {
			System.out.print(letras[i]);
		}
		
		entrada.close();
		
	}

}
