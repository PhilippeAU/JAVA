package Atividades;

import java.util.Scanner;

public class carros {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int n = 0;
		float ValorDesconto1;
		float ValorDesconto2;
		
		
		System.out.println("Concessionário CARANGO VELHO");
		System.out.println("Deseja prosseguir?");
		System.out.println("Digite S(sim) ou N(não): ");
		String prosseguir = entrada.next();
		
		if (prosseguir.equalsIgnoreCase("S")) {
			
			for(int i = 1; i > n;) {
				
				System.out.println("Informe o valor do carro: ");
				float ValorCarro = entrada.nextFloat();
				
				System.out.println("Informe o ano do carro: ");
				int AnoCarro = entrada.nextInt();
				
				if(AnoCarro <= 2000) {
					
					ValorDesconto1 = ((ValorCarro * 12)/100);
					System.out.println("O valor do carro: " + (ValorCarro - ValorDesconto1));
					
				}
				else {
					
					ValorDesconto2 = ((ValorCarro * 7)/100);
					System.out.println("O valor do carro: " + (ValorCarro - ValorDesconto2));
			
				}
				
				break;
			}
			System.out.println("Deseja prosseguir?");
			System.out.println("Digite S(sim) ou N(não): ");
			prosseguir = entrada.next();
			
			
		}
		
		entrada.close();
	}
}
