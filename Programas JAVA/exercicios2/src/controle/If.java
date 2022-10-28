package controle;

import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Informe a média: ");
		double media = entrada.nextDouble();
		
		if(media <= 10 && media >= 7.0) {
			
			System.out.println("Aprovado!!!");
	}
		else if(media < 7 || media >= 5) {
			
			System.out.println("Recuperação!!!");
		}
		else {
			
			
			System.out.println("Reprovado!!!");
		}
		
		
		entrada.close();
		
	}

}
