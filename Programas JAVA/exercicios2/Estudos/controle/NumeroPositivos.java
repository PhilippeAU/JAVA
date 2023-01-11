package controle;

import java.util.Scanner;

public class NumeroPositivos {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		int soma = 0;
		
		while(numero >= 0) {
			
			System.out.println("Digite um numero positivo e inteiro: ");
			numero = entrada.nextInt();
			soma = numero + soma;
			
			System.out.println();
			if(numero >= 0) {
			
				
			System.out.println("A soma até o momento: " + soma + "\n");
		}
			else {
				
				System.out.println("Número negativo!!!");
			}	
	}
			
		
		
		entrada.close();
	}

}
