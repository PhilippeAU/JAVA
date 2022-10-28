package fundamentos;

import java.util.Scanner;

public class QuadradoCubo {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite um valor: ");
		double valor = entrada.nextDouble();
		
		double quadrado = (valor*2);
		double cubo = (valor*valor*valor);
		
		System.out.println("O valor ao quadrado é: " + quadrado);
		System.out.println("O valor ao cubo é: " + cubo);
		
		
		
		entrada.close();
	}

}
