package Atividades;

import java.util.Scanner;

public class Pessoas {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int men = 0;
		int woman = 0;
		
		for(int i = 1; i <= 56; i++) {
			
			System.out.println("Informe seu nome: ");
			
			System.out.println("Qual é o seu sexo: ");
			String sexo = entrada.next();
			
			if (sexo.equalsIgnoreCase("masculino")) {
				
				men++;
			}
			else if(sexo.equalsIgnoreCase("feminino")) {
				
				woman++;
			}
		}
		
		System.out.println("O total de mulheres: " + woman);
		System.out.println("O total de homens: " + men);
		
		entrada.close();
	}

}
