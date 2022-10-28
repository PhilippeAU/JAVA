package Atividades;

import java.util.Scanner;

public class numeros80 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int entre = 0;
		for (int i = 1; i <= 80; i++) {
			
			System.out.println("Informe o valor: ");
			int valor = entrada.nextInt();
			
			if(valor >= 10 && valor <= 150) {
				
				entre++;
			}
		}
		System.out.printf("São %d números que estão entre 10 e 150!\n\n", entre);

		entrada.close();
	}

}
