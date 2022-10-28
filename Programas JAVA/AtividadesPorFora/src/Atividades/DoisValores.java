package Atividades;

import java.util.Scanner;

public class DoisValores {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int maior = 0;
		
		System.out.printf("Informe o primeiro valor inteiro: ");
		int valor1 = entrada.nextInt();
		
		maior = valor1;
		
		System.out.printf("Informe o segundo valor inteiro: ");
		int valor2 = entrada.nextInt();
		
		if(maior > valor2) {
			
			System.out.printf("O primeiro valor %d é maior que o segundo valor %d!", maior,valor2);
		}
		else {
			
			System.out.printf("O segundo valor %d é maior que o primeiro valor %d!",valor2,maior);
		}
		
		
		entrada.close();
	}

}
