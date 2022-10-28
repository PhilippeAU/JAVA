package Atividades;

import java.util.Scanner;

public class MaiorIdade {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		for(int i = 0; i <= 75;i++) {
			
			System.out.println("Informe a idade: ");
			int idade = entrada.nextInt();
		
			if(idade >= 18) {
				
				System.out.println("Maior de idade!!!\n");
			}
			else if(idade <= 17) {
				
				System.out.println("Menor de idade!!!\n");
			}
			else {
				
				System.out.println("Idade invalida!!!\n");
			}
		}
			
		entrada.close();
	}
}
