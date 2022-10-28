package Atividades;

import java.util.Scanner;

public class Redimento {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o valor depositado: ");
		double depositado = entrada.nextDouble();
		
		
		double redimento1 = ((depositado * 0.70)/100);
		double redimento2 = (depositado + redimento1);
		
		
		System.out.println("Redimento: " + redimento2);
		
		
		entrada.close();
	}

}
