package Atividades;

import java.util.Scanner;

public class soma {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Infome o primeiro número: ");
		int numero1 = entrada.nextInt();
		
		System.out.printf("Infome o segundo número: ");
		int numero2 = entrada.nextInt();
		
		int soma = (numero1 + numero2);
		
		System.out.println("A soma: " + soma);
		
		
		
		entrada.close();
	}

}
