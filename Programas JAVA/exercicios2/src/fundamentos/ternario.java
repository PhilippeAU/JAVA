package fundamentos;

public class ternario {
	
	public static void main(String[] args) {
		
		double media = 7.6;
		String resultadoParcial = media >= 5.0 ? "Recupera��o" : "Reprovado";
		String resultadoFinal = media >= 7.0 ? "Aprovado" : resultadoParcial;
		
		System.out.println("O aluno est� " + resultadoFinal);
		
		
		
		
	}

}
