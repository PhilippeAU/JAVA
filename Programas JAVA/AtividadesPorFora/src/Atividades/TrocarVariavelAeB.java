package Atividades;

import java.util.Scanner;

public class TrocarVariavelAeB {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor: ");
		int A = entrada.nextInt();
		
		System.out.println("Informe o segundo valor: ");
		int B = entrada.nextInt();
		
		int n = A;
		n = B;
		B = A;
		
		System.out.println();
		System.out.println(n);
		System.out.println(B);
		
		entrada.close();
	}

}
