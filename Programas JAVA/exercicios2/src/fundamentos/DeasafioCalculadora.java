package fundamentos;

import java.util.Scanner;

public class DeasafioCalculadora {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		double valor1 = entrada.nextDouble();
		System.out.println("Digite o primeiro segundo: ");
		double valor2 = entrada.nextDouble();
		
		System.out.println("Digite o s�bolo da opera��o que deseja realizar!!!");
		
		System.out.println("        + = Mais\n        - = Menos\n        * = Veses\n        / = Divis�o\n        % = resto\n\n\n");
		
		System.out.println("Qual deseja: ");
		String operacao = entrada.next();
		
		double resultado = "+".equals(operacao) ? valor1 + valor2 : 0;
		resultado = "-".equals(operacao) ? valor1 - valor2 : resultado;
		resultado = "*".equals(operacao) ? valor1 * valor2 : resultado;
		resultado = "/".equals(operacao) ? valor1 / valor2 : resultado;
		resultado = "%".equals(operacao) ? valor1 % valor2 : resultado;
		
		System.out.printf("O resulta � : %.2f %s %.2f = %.2f" ,valor1,operacao,valor2,resultado);

		
		
		
		entrada.close();
		
}
}
