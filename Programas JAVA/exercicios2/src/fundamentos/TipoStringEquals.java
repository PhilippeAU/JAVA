package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		System.out.println("2" == "2");
		
		String s = new String ("2");
		System.out.println("2" == s);
		System.out.println("2".equals(s));// equals comprara as Strings
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next();
		System.out.println("2".equals(s2.trim())); //Trim tira os espaço em branco
		
		
		entrada.close();
	}
}
