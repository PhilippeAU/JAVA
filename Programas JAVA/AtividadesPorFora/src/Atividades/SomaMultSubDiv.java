package Atividades;

import java.util.Scanner;

public class SomaMultSubDiv {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o primeiro n�mero: ");
		int numero1 = entrada.nextInt();
		
		System.out.print("Informe o segundo n�mero: ");
		int numero2 = entrada.nextInt();
		
		int soma = (numero1 + numero2);
		float divisao = (numero1 / numero2);
		int subtracao = (numero1 - numero2);
		int multiplicacao = (numero1 * numero2);
		
		System.out.println("Resultado da soma: " + soma);
		System.out.println("Resultado da subtra��o: " + subtracao);
		System.out.println("Resultado da multiplica��o: " + multiplicacao);
		System.out.println("Resultado da divis�o: " + divisao);
		
		entrada.close();
	}

}
