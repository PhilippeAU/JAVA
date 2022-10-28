package Atividades;

import java.util.Scanner;

public class CarroNovo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o valor de fabrica do carro: ");
		float Vcarro = entrada.nextFloat();
		
		float distribuidor = ((Vcarro * 28)/100);
		float impostos = ((Vcarro * 45)/100);
		
		float ValorFinal = (Vcarro + (distribuidor + impostos));
		
		System.out.println("O valor que o consumidor irá pagar no final é " + ValorFinal);
		
		entrada.close();
	}
}
