package controle;

import java.util.Scanner;

public class whileinderterminado {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		String sair = "";
		
		while(!sair.equalsIgnoreCase("sair")) {
		
		System.out.print("Digite qualquer coisa, para parar digite sair: ");
		sair = entrada.nextLine();
		
		}
		
		entrada.close();
	}
}
