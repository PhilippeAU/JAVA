package fundamentos;

import java.util.Scanner;

public class TemperaturaCelsius {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		float C = entrada.nextFloat();
		
		double F = (C * 1.8) + 32;
		
		System.out.println("A temperatura em Celsius é: " + F);
		
		
		
		entrada.close();
	}
}