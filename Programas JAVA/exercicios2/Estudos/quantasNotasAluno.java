import java.util.Scanner;

public class quantasNotasAluno {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantas notas voc�s quer informar?");
		int notasA = entrada.nextInt();
		
		double[] notasB = new double[notasA];
		
		for (int i = 0; i < notasB.length; i++) {
			
			System.out.printf("Digite a %d� nota: ",i+1);
			notasB[i] = entrada.nextDouble();
		}
		System.out.println();
		
		double total = 0;
		for(double notas: notasB) {
			
			total += notas;
			System.out.println(notas + " ");
		}
		
		System.out.println("\nA m�dia das notas: " + total / notasB.length);
		entrada.close();
		
	}
}
