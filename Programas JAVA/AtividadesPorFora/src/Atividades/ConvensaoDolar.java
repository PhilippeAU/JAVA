package Atividades;

import java.util.Scanner;

public class ConvensaoDolar {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o valor em dolar: ");
		float dolar = entrada.nextFloat();
		
		System.out.println("Informe o valor da cotação do dolar: ");
		float cotacao = entrada.nextFloat();
		
		float real = (dolar * cotacao);
		
		System.out.printf("%.2f em real: %.2f", dolar,real);
		
		
		entrada.close();
	}

}
