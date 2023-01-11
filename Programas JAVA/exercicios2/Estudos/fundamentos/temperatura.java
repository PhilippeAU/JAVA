package fundamentos;

import java.util.Scanner;

public class temperatura {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite a temperatura em Fahenheit: ");
		float F = entrada.nextFloat();
		
		double C = (F - 32)/(1.8);
		
		System.out.println("A temperatura em Celsius é: " + C);
		
		
		
		entrada.close();
	}
}
