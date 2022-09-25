package fundamentos;

public class TipoString {

	public static void main(String[] args) {

		System.out.println("Ol� pessoal" .charAt(5));
		
		String s = "Ol� Mundo!!!";
		System.out.println(s.concat("!!!"));
		System.out.println(s + ("!!!"));
		System.out.println(s.startsWith("Ol�"));
		System.out.println(s.toLowerCase().startsWith("ol�"));
		System.out.println(s.endsWith("!!!"));
		System.out.println(s.length());
		System.out.println(s.equals("Boa tarde"));
		System.out.println(s.equalsIgnoreCase("Ol� Mundo!!!"));

		var nome = "Philippe";
		var sobrenome = "Augusto";
		var idade = 21;
		var salario = 12345.987;

		System.out.println("Nome: " + nome + " Sobrenome: " + sobrenome + " Idade: " + idade + " Sal�rio: R$" + salario + ".");
		System.out.printf("Nome: %s Sobrenome: %s Idade: %d Sal�rio: R$%.2f.", nome, sobrenome, idade, salario);
		String frase = String.format("\nNome: %s Sobrenome: %s Idade: %d Sal�rio: R$%.2f.", nome, sobrenome, idade, salario);
		System.out.println(frase);

	}
}
