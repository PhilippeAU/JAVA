package controle;

import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos dias tem o ano atual: ");
		int dia = entrada.nextInt();
		
		if(dia == 366) {
			
			System.out.println("O ano � bissexto!");
		}
		else {
			System.out.println("O ano n�o � bissexto!");
		}
		
		entrada.close();
	}
}
