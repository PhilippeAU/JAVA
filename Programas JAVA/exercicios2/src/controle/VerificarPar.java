package controle;

import java.util.Scanner;

public class VerificarPar {
		
		public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Digite um número: ");
			double numero = entrada.nextDouble();			
		
			if(numero >= 0 && numero <= 10) {
				
				if(numero % 2 == 0) {
				
				System.out.printf("O número %.1f esta entre 0 e 10 e é par!!!", numero);
			}
				else {
					System.out.printf("O número %.1f esta entre 0 e 10 e não é par!!!", numero);
				}
			}
			else {
				System.out.printf("O número %.1f não esta entra 0 e 10!!!", numero);
			}
			
			entrada.close();
		}

}
