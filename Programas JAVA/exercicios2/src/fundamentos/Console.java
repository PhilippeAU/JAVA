package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" dia! \n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d\n" ,1 ,2 ,3 ,4 ,5 ,6);
		System.out.printf("Sal�rio: %.2f\n", 1234.56789);
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite os seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.println("\n\nNome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade);
		System.out.printf("%s %s tem %d anos",nome,sobrenome,idade);
		
		entrada.close();
	}
}
