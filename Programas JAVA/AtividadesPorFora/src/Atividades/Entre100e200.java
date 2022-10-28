package Atividades;

import java.util.Scanner;

public class Entre100e200 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Informe o valor inteiro: ");
		int valor = entrada.nextInt();
		
		if(valor >=100 && valor <=200) {
			
			System.out.printf("O valor %d está entre 100 e 200", valor);
		}
		
		entrada.close();
	}

}
