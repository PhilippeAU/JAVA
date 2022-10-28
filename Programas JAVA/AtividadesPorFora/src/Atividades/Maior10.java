package Atividades;

import java.util.Scanner;

public class Maior10 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Informe um valor inteiro: ");
		int valor = entrada.nextInt();
		
		if (valor > 10) {
			
			System.out.printf("O número %d é maior que 10!",valor);
		}
		
		entrada.close();
	}

}
