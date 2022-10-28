package Atividades;

import java.util.Scanner;

public class ConsumoMedio {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a distância percorrida em km: ");
		double distancia = entrada.nextDouble();
		
		System.out.println("Informe a quantidade de combustível gasto: ");
		int gasolina = entrada.nextInt();
		
		double media = ((distancia*1000) / gasolina);
		
		System.out.println("O consumo médio: " + media);
		
		
		entrada.close();
	}

}
