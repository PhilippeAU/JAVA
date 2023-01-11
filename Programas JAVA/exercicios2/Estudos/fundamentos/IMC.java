package fundamentos;

import java.util.Scanner;

public class IMC {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Descruba seu IMC!!!");
		
		System.out.println("\nDigite sua altura: ");
		double altura = entrada.nextDouble();
		
		System.out.println("\nDigite seu peso: ");
		double peso = entrada.nextDouble();
		
		double imc = (peso/(altura * altura));
		
		System.out.println("Seu IMC é: " + imc);
		
		entrada.close();
	}

}
