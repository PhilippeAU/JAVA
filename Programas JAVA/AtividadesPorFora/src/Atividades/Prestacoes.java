package Atividades;

import java.util.Scanner;

public class Prestacoes {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o valor do produto: ");
		float produto = entrada.nextFloat();
		
		float pres = (produto / 5);
		
		System.out.println("Ser�o 5 presta��es de " + pres + " reais!");
		
		
		entrada.close();
	}

}
