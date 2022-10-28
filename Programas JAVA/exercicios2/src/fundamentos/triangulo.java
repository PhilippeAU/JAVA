package fundamentos;

import java.util.Scanner;

public class triangulo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor da base do triângulo: ");
		double base = entrada.nextDouble();
		
		System.out.println("Digite o valor da altura do triângulo: ");
		double altura = entrada.nextDouble();
		
		double area = ((base * altura)/2);
		
		System.out.println("A área do triângulo é: " + area);
		
		
		
		entrada.close();
	}
}
