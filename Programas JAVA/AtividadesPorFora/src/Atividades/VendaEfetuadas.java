package Atividades;

import java.util.Scanner;

public class VendaEfetuadas {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe seu nome: ");
		String nome = entrada.next();
		
		System.out.print("Informe seu salário fixo: ");
		double salario = entrada.nextDouble();
		
		System.out.print("Informe quantas vendas foram efetuadas em dinheiro: ");
		int v = entrada.nextInt();
		
		double vendas = ((v * 15)/100);
		double soma = (salario + vendas);
		
		System.out.println("O nome do vendedor: " + nome);
		System.out.println("O salário fixo: " + salario);
		System.out.println("Salário no final do mês: " + soma);
		
		
		
		
		entrada.close();
	}

}
