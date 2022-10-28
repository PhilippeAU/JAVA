package controle;

import java.util.Scanner;

public class MaiorNumero {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int maiorNumero = 0;
		
		for(int i = 10; i > 0; i--) {
			
			System.out.printf("Infome o %d numero: ",i);
			int numero = entrada.nextInt();	
			
			if(numero > maiorNumero) {
				maiorNumero = numero;
			}
			
	}
		System.out.print("O maior número: " + maiorNumero);
		
		entrada.close();
	}

}
