package Atividades;

import java.util.Scanner;

public class Aluno3Notas {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Informe seu nome completo: ");
		String nome = entrada.next();
		
		System.out.printf("Informe a primeira nota: ");
		float nota1 = entrada.nextFloat();
		
		System.out.printf("Informe a segunda nota: ");
		float nota2 = entrada.nextFloat();
		
		System.out.printf("Informe a terceira nota: ");
		float nota3 = entrada.nextFloat();
		
		float media = ((nota1 + nota2 + nota3)/3);
		
		System.out.println("O nome do aluno: " + nome);
		System.out.printf("A média do aluno: %.2f" , media);
		
		
		entrada.close();
	}
}
