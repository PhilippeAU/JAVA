package Atividades;

import java.util.Scanner;

public class VendaEfetuadas {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe seu nome: ");
		String nome = entrada.next();
		
		System.out.print("Informe seu sal�rio fixo: ");
		double salario = entrada.nextDouble();
		
		System.out.print("Informe quantas vendas foram efetuadas em dinheiro: ");
		int v = entrada.nextInt();
		
		double vendas = ((v * 15)/100);
		double soma = (salario + vendas);
		
		System.out.println("O nome do vendedor: " + nome);
		System.out.println("O sal�rio fixo: " + salario);
		System.out.println("Sal�rio no final do m�s: " + soma);
		
		
		
		
		entrada.close();
	}

}
