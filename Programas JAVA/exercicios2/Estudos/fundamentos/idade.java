package fundamentos;

import java.util.Scanner;

public class idade {
	
	private static Scanner in;

	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		
		int anos,meses,dias;
		
		System.out.println("Digite quantos anos você tem? ");
		anos = in.nextInt();
		
		System.out.println("Digite quantos meses você tem? ");
		meses = in.nextInt();
		
		System.out.println("Digite qual dia ta no mês? ");
		dias = in.nextInt();
		
		int anosV = (anos * 365);
		int mesesV = (meses * 30);
		int idade = (anosV + mesesV + dias);
		
		System.out.println(idade);
		
	}
	
	
}
